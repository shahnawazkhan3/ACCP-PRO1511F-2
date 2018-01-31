package com.zaaviyah.alpha_intent_17_1_18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button B1call,btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        B1call =(Button)findViewById(R.id.btCall);
        btRegister= (Button)findViewById(R.id.btRegister);


        B1call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:045455555"));


                startActivity(callIntent);

            }
        });

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent RegisterIntent =new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(RegisterIntent);

            }
        });

    }
}
