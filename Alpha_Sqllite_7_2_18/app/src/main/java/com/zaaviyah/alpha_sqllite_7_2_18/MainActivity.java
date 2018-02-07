package com.zaaviyah.alpha_sqllite_7_2_18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1AD, b2Update, b3Delete, b4get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1AD=(Button)findViewById(R.id.btAdd);
        b2Update=(Button)findViewById(R.id.btUpdate);
        b3Delete=(Button)findViewById(R.id.btDelete);
        b4get=(Button)findViewById(R.id.btGet);

        b1AD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent addiNTENT =new Intent(MainActivity.this,AddActivity.class);
                startActivity(addiNTENT);
            }
        });
    }
}
