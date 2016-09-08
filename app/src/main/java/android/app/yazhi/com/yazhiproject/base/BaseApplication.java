package android.app.yazhi.com.yazhiproject.base;

import android.app.Application;

/**
 * Created by apple on 16-9-8.
 */
public class BaseApplication extends Application {
    private static BaseApplication INSTANCE = null;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
    public static BaseApplication getInstance(){
        return  INSTANCE;
    }
}
