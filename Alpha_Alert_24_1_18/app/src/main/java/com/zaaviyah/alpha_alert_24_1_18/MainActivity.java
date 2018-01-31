package com.zaaviyah.alpha_alert_24_1_18;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1Alert;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1Alert =(Button)findViewById(R.id.btAlert);

        b1Alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertShow();
            }
        });
    }

    private void AlertShow() {

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);


        alertBuilder.setTitle("welcome alert");
        alertBuilder.setMessage("here login know");

        alertBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        alertBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"yes main", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alerdilog =alertBuilder.create();

        alerdilog.show();

    }
}
