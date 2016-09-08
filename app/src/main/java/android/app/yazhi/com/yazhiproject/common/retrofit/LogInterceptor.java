package android.app.yazhi.com.yazhiproject.common.retrofit;

import android.util.Log;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;

public class LogInterceptor implements Interceptor {
    private String TAG = "YZMLog===";
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Log.e(TAG, "UTL:" + request.toString());//输出请求前整个url
        long t1 = System.nanoTime();
        Response response = chain.proceed(chain.request());
        long t2 = System.nanoTime();
//          Log.v(TAG,response.request().url()+response.headers());//输出一个请求的网络信息
        MediaType mediaType = response.body().contentType();
        String content = response.body().string();
        Log.e(TAG, "response body:" + content);//输出返回信息
        return response.newBuilder()
                .body(okhttp3.ResponseBody.create(mediaType, content))
                .build();
    }
}
