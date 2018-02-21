package com.zaaviyah.firebase_21_2_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {


    EditText etemail, etpassword;
    Button b1Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //ADD ID EDITT AND BUTTON

        etemail=(EditText)findViewById(R.id.etLoginEmail);
        etpassword=(EditText)findViewById(R.id.etLogPassword);
        b1Register=(Button)findViewById(R.id.btRegRegister);


        b1Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                String email =etemail.getText().toString();
//                String password= etpassword.getText().toString();
//
//                if(TextUtils.isEmpty(email)){
//                    Toast.makeText(getApplicationContext(),"email error",Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                if(TextUtils.isEmpty(password)){
//                    Toast.makeText(getApplicationContext(),"email error",Toast.LENGTH_SHORT).show();
//                    return;

            }
        });


    }
}
