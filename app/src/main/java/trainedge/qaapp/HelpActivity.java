package trainedge.qaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.firebase.auth.FirebaseAuth;

public class HelpActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_choose,et_msg,et_subject;
    private Button btn_send;
    private FirebaseAuth firebaseAuth;
    private RadioButton rb_tech, rb_admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        et_choose = (EditText) findViewById(R.id.et_subject);
        et_subject = (EditText) findViewById(R.id.et_subject);
        et_msg = (EditText) findViewById(R.id.et_msg);
        btn_send = (Button) findViewById(R.id.btn_send);
        rb_tech = (RadioButton) findViewById(R.id.rb_tech);
        rb_admin = (RadioButton) findViewById(R.id.rb_admin);

        btn_send.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.setting:
                return true;
            case R.id.logout:
                Logout();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void Logout() {
        //logging out the user
        firebaseAuth.signOut();
        //closing activity
        finish();
        //starting login activity
        startActivity(new Intent(this, SignupActivity.class));

    }
}
