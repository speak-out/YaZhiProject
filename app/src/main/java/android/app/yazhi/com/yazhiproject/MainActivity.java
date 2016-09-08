package android.app.yazhi.com.yazhiproject;

import android.app.yazhi.com.yazhiproject.base.BaseActivity;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

public class MainActivity extends FragmentActivity {

    private TableLayout tableLayout;
    private ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
        initCenter();

    }

    private void initCenter() {
        tableLayout = (TableLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new MainAdapter());
    }
    class MainAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return false;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }

    }

}
