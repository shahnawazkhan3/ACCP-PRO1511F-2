package com.zaaviyah.alpha_ui_19_1_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

//    ToggleButton toggle1, toggle2;
//    Button bt1;
//     CheckBox ckPizaa, ckBurger, ckIceCream;
//      Button b1Calculate;
    RadioButton rdMale, rdFemale,rdKhan, rdShah,genderradioButton;
    RadioGroup radiogroup;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        bt1 =(Button)findViewById(R.id.btshow);
//        toggle1= (ToggleButton)findViewById(R.id.toggleButton);
//        toggle2= (ToggleButton)findViewById(R.id.toggleButton2);
//
//        bt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                StringBuilder result = new StringBuilder();
//                result.append("ToggleButton :").append(toggle1.getText());
//                result.append("ToggleButton 2 :").append(toggle2.getText());
//
//                //Display here
//                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
//            }
//        });

        // this is method checkbox

       // addListenerOnButtonClick();

        //addListenerRadioButton();

        b1= (Button)findViewById(R.id.btRadio);
        radiogroup=(RadioGroup)findViewById(R.id.radioGroup);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radiogroup.getCheckedRadioButtonId();

                genderradioButton = (RadioButton) findViewById(selectedId);
                if(selectedId==-1){
                    Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });







    }



//    private void addListenerOnButtonClick() {
//
//        ckPizaa = (CheckBox)findViewById(R.id.ckPizaa);
//        ckBurger = (CheckBox)findViewById(R.id.ckBurger);
//        ckIceCream = (CheckBox)findViewById(R.id.ckIiceCream);
//
//        b1Calculate = (Button)findViewById(R.id.btTotal);
//
//        b1Calculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                int totalamount =0;
//
//                StringBuilder result = new StringBuilder();
//
//                result.append("SELECT ITEAMS");
//
//                if(ckPizaa.isChecked()){
//                    result.append("\npizza 100 Rs:");
//                    totalamount+=100;
//
//                }
//                if(ckBurger.isChecked()){
//                    result.append("\nBruger 50 Rs:");
//                    totalamount+=50;
//
//                }
//
//                if(ckIceCream.isChecked()){
//                    result.append("\nIce cream 200 Rs:");
//                    totalamount+=200;
//
//                }
//
//                result.append("\nTotal: "+totalamount+"Rs");
//
//                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
//
//
//            }
//        });
//    }
}
