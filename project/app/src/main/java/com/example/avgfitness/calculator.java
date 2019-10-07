package com.example.avgfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4;
    Button b1, b2, b3;
    ProgressBar p;
    TextView t1, t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);
        ed3 = (EditText) findViewById(R.id.ed3);
        ed4 = (EditText) findViewById(R.id.ed4);
        b1 = (Button) findViewById(R.id.bt1);
        b2 = (Button) findViewById(R.id.bt2);
        b3=(Button)findViewById(R.id.bt3);
        t1 = (TextView) findViewById(R.id.tv1);
        t2 = (TextView) findViewById(R.id.tv2);
        p = (ProgressBar) findViewById(R.id.p1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculatebmi();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double waist=Double.parseDouble(ed3.getText().toString().trim());
                Double hip=Double.parseDouble(ed4.getText().toString().trim());

                Double whr=( waist/hip);
                t2.setText(Double.toString(whr));

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
            }
        });
    }
    public void calculatebmi(){
        String weight=ed1.getText().toString();
        String height=ed2.getText().toString();

        if (height !=null && !"".equals(height) && weight!=null && !"".equals(weight)){

            double ht=Double.parseDouble(height)/100;
            double wt=Double.parseDouble(weight);

            double bmi=(wt) /(ht * ht);
            displayBMI(bmi);

        }
    }
     public void displayBMI(double bmi){
        String bmiLabel="";

        if (Double.compare(bmi,15f)<=0){
            bmiLabel="very severely underweight";
        }
        else if (Double.compare(bmi,15f) >0 && Double.compare(bmi,16f) <=0){
            bmiLabel="severely underweight";
        }
        else if (Double.compare(bmi,16f) >0 && Double.compare(bmi,18.5f) <=0){
            bmiLabel=" underweight";
        }
        else if (Double.compare(bmi,18.5f) >0 && Double.compare(bmi,25f) <=0){
            bmiLabel="normal";
        }
        else if (Double.compare(bmi,25f) >0 && Double.compare(bmi,30f) <=0){
            bmiLabel="overweight";
        }
        else if (Double.compare(bmi,30f) >0 && Double.compare(bmi,35f) <=0){
            bmiLabel="obese class I";
        }
        else if (Double.compare(bmi,35f) >0 && Double.compare(bmi,40f) <=0){
            bmiLabel="obese class II";
        }
        else{
            bmiLabel="obese class III";
        }

        bmiLabel= bmi+ "-->" +bmiLabel;
        t1.setText(bmiLabel);


     }
  
}



