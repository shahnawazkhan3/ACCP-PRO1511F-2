package com.zaaviyah.alpha_sqllite_7_2_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    Button b1Insert;
    EditText etAddNAME,etADDeMAIL,etADDnumber;

    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        databaseHelper=new DatabaseHelper(this);

        b1Insert=(Button)findViewById(R.id.btAddInsert);
        etAddNAME =(EditText)findViewById(R.id.etAddNAME);
        etADDeMAIL =(EditText)findViewById(R.id.etAddEmaail);
        etADDnumber =(EditText)findViewById(R.id.etAddMobile);

        b1Insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean result =databaseHelper.insertContact(etAddNAME.getText().toString(),etADDnumber.getText().toString(),etADDeMAIL.getText().toString());

                if(result){
                    Toast.makeText(AddActivity.this,"insert",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AddActivity.this,"not insrt",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
