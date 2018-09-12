package edu.gatech.seclass.sdpsalarycomp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class SDPSalaryCompActivity extends AppCompatActivity {

    private EditText salaryInput;
    private Spinner currentCityInput;
    private Spinner newCityInput;
    private EditText targetSalaryOutput;
    private ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdpsalary_comp);

        salaryInput = (EditText) findViewById(R.id.baseSalary);
        currentCityInput = (Spinner) findViewById(R.id.currentCity);
        newCityInput = (Spinner) findViewById(R.id.newCity);
        targetSalaryOutput = (EditText) findViewById(R.id.targetSalary);

        adapter = ArrayAdapter.createFromResource(this,R.array.city,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        currentCityInput.setAdapter(adapter);
        currentCityInput.setSelection(0);
        newCityInput.setAdapter(adapter);
        newCityInput.setSelection(0);

    }
}
