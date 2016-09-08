package android.app.yazhi.com.yazhiproject.module.yazhi.fragment;

import android.app.yazhi.com.yazhiproject.R;
import android.app.yazhi.com.yazhiproject.base.BaseFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by apple on 16-9-8.
 */
public class YaZhiFragment extends BaseFragment{
    private static YaZhiFragment mInstance;
    private static Context mContext;
    public static YaZhiFragment getmInstance(Bundle args,Context context){
        mContext = context;
        if(mInstance == null){
                mInstance = new YaZhiFragment();
        }
        return  mInstance;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_yazhi,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
    }
}
