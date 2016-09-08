package android.app.yazhi.com.yazhiproject.common;



import android.app.yazhi.com.yazhiproject.bean.BaseBeanRequest;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by yuer on 2016/8/24.
 */
public interface ApiService {
    //@GET("data/福利/{pagenum}/{page}")
   // Observable<ResponseBody> getMeimei() int pageNum, @Path(RequesetBean.getDemo.page) int page);

    //    String requestString = "/getServiceList"+RequestConstant.getExUrl();
//    @Headers( "Content-Type: application/json" )
    @POST(RequestMethod.getCorplist)
    Observable<Object> getCorplist(@Body BaseBeanRequest map);

    @POST(RequestMethod.getArea)
    Observable<Object> GetAear(@Body BaseBeanRequest bean);
}
