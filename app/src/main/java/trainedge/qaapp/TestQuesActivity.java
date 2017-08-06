package trainedge.qaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class TestQuesActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TextView tv_subjectname;
    private TextClock textClock;
    private Button btn_previous,btn_next;

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


    }

}
