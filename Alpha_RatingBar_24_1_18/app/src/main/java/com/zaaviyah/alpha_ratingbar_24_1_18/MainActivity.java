package com.zaaviyah.alpha_ratingbar_24_1_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button b1Alert;
    RatingBar rtingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1Alert= (Button)findViewById(R.id.btRatin);




        b1Alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ratinbar();
            }
        });


    }

    private void ratinbar() {

        rtingBar= (RatingBar)findViewById(R.id.rtBar);

        String result = String.valueOf(rtingBar.getRating());

        Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
    }
}
