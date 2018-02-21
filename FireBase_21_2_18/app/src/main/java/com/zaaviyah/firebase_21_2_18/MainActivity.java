package com.zaaviyah.firebase_21_2_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName, etPassword;
    Button b1Login,b2register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //GET ID BUTTON  EDITE TEXT

        etName=(EditText)findViewById(R.id.etLoginEmail);
        etPassword =(EditText)findViewById(R.id.etLogPassword);
        b1Login=(Button)findViewById(R.id.btLogin);

        b2register=(Button)findViewById(R.id.btLoginRegister);


        b2register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerEmail = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerEmail);
            }
        });




    }
}
