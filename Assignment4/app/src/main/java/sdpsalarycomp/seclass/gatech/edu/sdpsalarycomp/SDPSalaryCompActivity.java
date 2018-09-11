package sdpsalarycomp.seclass.gatech.edu.sdpsalarycomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SDPSalaryCompActivity extends AppCompatActivity {

    private EditText salaryValue;
    private EditText targetSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdpsalary_comp);

        salaryValue = (EditText)findViewById(R.id.baseSalary);
        targetSalary = (EditText)findViewById(R.id.targetSalary);

        targetSalary.setText("hahahah");


    }
}
