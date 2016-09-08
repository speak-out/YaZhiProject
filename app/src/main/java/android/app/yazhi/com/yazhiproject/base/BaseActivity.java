package android.app.yazhi.com.yazhiproject.base;

import android.app.Activity;
import android.app.yazhi.com.yazhiproject.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by apple on 16-9-8.
 */
public abstract class BaseActivity extends AppCompatActivity {
    RelativeLayout llTopContain;
    RelativeLayout rlCenterContain;
    private View topView;
    private View CenterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_layout);
        llTopContain = (RelativeLayout) findViewById(R.id.rl_top_contain);
        rlCenterContain = (RelativeLayout) findViewById(R.id.rl_center_contain);
        initView();
    }

    private void initView() {
        topView = setTopView();
        CenterView = setCenterView();
        if (topView != null) {
            llTopContain.removeAllViews();
            llTopContain.addView(topView);
        } else {
            llTopContain.setVisibility(View.GONE);
        }
        if (CenterView != null) {
            rlCenterContain.removeAllViews();
            rlCenterContain.addView(CenterView);
        }
    }

    protected abstract View setTopView();

    public abstract View setCenterView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
