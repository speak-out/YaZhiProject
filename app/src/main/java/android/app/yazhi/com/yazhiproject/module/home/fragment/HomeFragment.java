package android.app.yazhi.com.yazhiproject.module.home.fragment;

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

public class HomeFragment extends BaseFragment{

    private static HomeFragment mInstance ;
    private static Context mContext;


    public static HomeFragment getInstance(Bundle args,Context context) {
        mContext = context;
        if (mInstance == null) {
            mInstance = new HomeFragment();
        }
        mInstance.setArguments(args);
        return mInstance;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);
        initView(view);
        return view;
    }

    private void initView(View view) {
    }
}
