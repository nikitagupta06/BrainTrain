package trainedge.qaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import trainedge.qaapp.Fragment.QuesFragment;
import trainedge.qaapp.Model.QuesModel;


public class TestQuesActivity extends AppCompatActivity implements ValueEventListener {


    private TextView tv_subjectname;
    private TextClock textClock;
    private Button btn_previous, btn_next;

    private ViewPager mViewPager;

    private ArrayList<QuesModel> question;
    public static final String SUBJECT_NAME = "trainedge.qaapp.SUBJECT_NAME";
    private String category;
    private QAdapter adapter;


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


        Intent intent = getIntent();
        category = intent.getStringExtra(SUBJECT_NAME);

        mViewPager = (ViewPager) findViewById(R.id.container);

        // firebase
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference dbRef = db.getReference("Questions");
        dbRef.orderByValue().addValueEventListener(this);
        question = new ArrayList<>();

        adapter = new QAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                QuesFragment item = (QuesFragment) adapter.getItem(position);
                item.setupData(question.get(position));

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {

        if (dataSnapshot.hasChildren()) {
            question.clear();
            for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                // step 17
                if (snapshot.child("category").getValue(String.class).equals(category)) {
                    continue;
                }
                question.add(snapshot.getValue(QuesModel.class));
                adapter.notifyDataSetChanged();

                // update adapter
            }
        }
    }

    @Override
    public void onCancelled(DatabaseError databaseError) {
        if (databaseError != null) {
            Toast.makeText(TestQuesActivity.this, "could not get data " + databaseError.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public class QAdapter extends FragmentPagerAdapter {

        public QAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {

            QuesFragment quesFragment = new QuesFragment();
            return quesFragment;
        }

        @Override
        public int getCount() {
            return question.size();
        }
    }


}