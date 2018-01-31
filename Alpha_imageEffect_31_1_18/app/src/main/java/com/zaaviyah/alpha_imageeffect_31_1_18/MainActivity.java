package com.zaaviyah.alpha_imageeffect_31_1_18;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Bitmap bmp;
    private ImageView img;
    private Bitmap operation;
    Button b1, b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.btGreen);

        img= (ImageView)findViewById(R.id.imgView);

        BitmapDrawable bmpd = (BitmapDrawable)img.getDrawable();
        bmp=bmpd.getBitmap();

    }

    public void gray(View view){

        operation=Bitmap.createBitmap(bmp.getWidth(),bmp.getHeight(),bmp.getConfig());

        double red = 0.33;
        double green = 0.59;
        double blue = 0.11;

        for(int i=0; i<bmp.getWidth();i++){
            for (int j =0; j<bmp.getHeight(); j++){

                int p =bmp.getPixel(i,j);
                int r = Color.red(p);
                int g = Color.green(p);
                int b = Color.blue(p);


                r = (int) red * r;
                g = (int) green * g;
                b = (int) blue * b;

                operation.setPixel(i,j,Color.argb(Color.alpha(p), r, g, b));

            }

        }
        img.setImageBitmap(operation);
    }
}
