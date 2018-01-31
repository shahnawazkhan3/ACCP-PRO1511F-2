package com.zaaviyah.alpha_email_9_1_18;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1SEND ;
    EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1SEND = (Button) findViewById(R.id.btSend);
        etEmail= (EditText)findViewById(R.id.etEmail);

        b1SEND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail ();
            }
        });

    }

    public  void sendEmail (){
        Log.i("sending", " ");

        String [] CC = {" "};
        String [] TO = {" "};

        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL,TO);
        emailIntent.putExtra(Intent.EXTRA_CC,CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "YES");
        emailIntent.putExtra(Intent.EXTRA_TEXT," WELECOME");

        try {
           startActivity(Intent.createChooser(emailIntent,"sending yes"));
            Log.i("finsh", "");
            Toast.makeText(MainActivity.this, "yes sending", Toast.LENGTH_SHORT).show();

        }catch (android.content.ActivityNotFoundException e ){
            Toast.makeText(MainActivity.this, "not sending",Toast.LENGTH_SHORT).show();
        }



    }

}
