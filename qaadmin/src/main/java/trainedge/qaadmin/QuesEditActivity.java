package trainedge.qaadmin;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class QuesEditActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private Spinner spinner_category,spinner_answer;
    private EditText et_question,et_a,et_b,et_c,et_d;
    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_edit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner_category = (Spinner) findViewById(R.id.spinner_category);
        spinner_answer = (Spinner) findViewById(R.id.spinner_answer);
        et_question = (EditText) findViewById(R.id.et_question);
        et_a = (EditText) findViewById(R.id.et_a);
        et_b = (EditText) findViewById(R.id.et_b);
        et_c = (EditText) findViewById(R.id.et_c);
        et_d = (EditText) findViewById(R.id.et_d);
        btn_save = (Button) findViewById(R.id.btn_save);

        //spinner array
        ArrayList<String> category=new ArrayList();
        category.add("C");
        category.add("C++");
        category.add("JAVA");
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,category);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner_category.setAdapter(adapter);
        spinner_category.setOnItemSelectedListener(this);

        btn_save.setOnClickListener(this);

        
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
