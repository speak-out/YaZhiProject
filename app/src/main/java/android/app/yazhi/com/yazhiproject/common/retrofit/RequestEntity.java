package android.app.yazhi.com.yazhiproject.common.retrofit;

import android.app.yazhi.com.yazhiproject.common.ApiService;
import android.app.yazhi.com.yazhiproject.database.CacheDataBase;
import android.util.Log;



import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;

public class RequestEntity {

    public static final String TAG = "YZMLog---";
    private BehaviorSubject cache;

    public static ApiService getApiService() {
        return RetrofitNewInstance.getInstance().create(ApiService.class);
    }
    public static Subscription request(Observable<Object> observable,ResponseInterface responseIn,String RequestTag){
        return  request(observable,responseIn,RequestTag,true);
    }
    /**
     * @param observable
     * @param responseIn 请求回调接口
     * @param RequestTag  请求标识，这里两个作用，用着缓存和返回的标识
     * @param flag 缓存标识符，是否缓存，默认是
     * @return
     */
    public static Subscription request(Observable<Object> observable, ResponseInterface responseIn, final String RequestTag, final boolean flag) {

        final ResponseInterface response = responseIn;
        Observer observer = new Observer<Object>() {

            @Override
            public void onCompleted() {
                Log.i(TAG, "====onCompleted====");
                response.onCompleted();
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: " + e.toString());
                Object object = null;
                if(flag && RequestTag!=null && !RequestTag.equals("")){
                    object = CacheDataBase.readCache(RequestTag);
                }
                if (object != null && !object.equals("")) {
                    response.onSuccee(object, RequestTag);
                } else {
                    response.onError(e);
                }
            }

            @Override
            public void onNext(Object object) {
                if(flag && RequestTag!=null && !RequestTag.equals("")){
                    CacheDataBase.saveCache(response, RequestTag);
                }
                response.onSuccee(object, RequestTag);
            }
        };
        Subscription subscruiption = observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
        return subscruiption;
    }
}



