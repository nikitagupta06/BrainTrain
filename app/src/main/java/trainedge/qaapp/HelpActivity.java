package trainedge.qaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HelpActivity extends AppCompatActivity {

    private EditText et_help,et_msg;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        et_help = (EditText) findViewById(R.id.et_subject);
        et_msg = (EditText) findViewById(R.id.et_msg);
        btn_send = (Button) findViewById(R.id.btn_send);
    }

}
