package com.zaaviyah.alpha_progresscircle_29_1_18;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1Show;
    private ProgressDialog progressBar ;
    private int progressBarStatus= 0;
    private Handler progressBarHendler = new Handler();
    private long fileSize = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1Show=(Button)findViewById(R.id.btShow);


        b1Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // HERS SHOW intila
                progressBar=new ProgressDialog(v.getContext());
                progressBar.setMessage("Downlaoding");
                progressBar.setMax(100);
                progressBar.setCancelable(true);
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setProgress(0);
                progressBar.show();

                progressBarStatus=0;
                fileSize=0;

               new Thread(new Runnable() {
                   @Override
                   public void run() {

                       while (progressBarStatus <100){

                           progressBarStatus =download();

                           try{

                               Thread.sleep(1000);
                           }

                           catch(InterruptedException e){
                             e.printStackTrace();
                           }

                           /// method progressHender
                           progressBarHendler.post(new Runnable() {
                               @Override
                               public void run() {
                                  progressBar.setProgress(progressBarStatus);
                               }
                           });
                       }

                       // another method if agar zada ho values tw

                       if(progressBarStatus  >=100){



                           try {
                               Thread.sleep(2000);
                           }catch (InterruptedException e){
                               e.printStackTrace();
                           }
                       }



                   }
               }).start();

            }
        });

    }

    private int download() {

        while (fileSize <=1000000){

            fileSize++;

            if (fileSize == 100000) {
                return 10;
            }else if (fileSize == 200000) {
                return 20;
            }else if (fileSize == 300000) {
                return 30;
            }else if (fileSize == 400000) {
                return 40;
            }else if (fileSize == 500000) {
                return 50;
            }else if (fileSize == 700000) {
                return 70;
            }else if (fileSize == 800000) {
                return 80;
            }
        }
        return 100;
    }
}
