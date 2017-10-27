package trainedge.qaapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class TestQuesActivity extends AppCompatActivity {


    private TextView tv_subjectname;
    private TextClock textClock;
    private Button btn_previous, btn_next;

    private ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ques);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv_subjectname = (TextView) findViewById(R.id.tv_subjectname);
        textClock = (TextClock) findViewById(R.id.textClock);
        btn_previous = (Button) findViewById(R.id.btn_previous);
        btn_next = (Button) findViewById(R.id.btn_next);

        mViewPager = (ViewPager) findViewById(R.id.container);
        QAdapter adapter=new QAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);

    }
    public class QAdapter extends FragmentPagerAdapter {

        public QAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Previous Question";
                case 1:
                    return "Next Question";
            }
            return super.getPageTitle(position);
        }
    }


}