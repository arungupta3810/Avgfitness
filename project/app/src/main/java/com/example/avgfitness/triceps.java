package com.example.avgfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class triceps extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);
        tv1=(TextView)findViewById(R.id.ttvb0);
        tv2=(TextView)findViewById(R.id.ttvb1);
        tv3=(TextView)findViewById(R.id.ttvb2);
        tv4=(TextView)findViewById(R.id.ttvb3);
        tv5=(TextView)findViewById(R.id.ttvb4);
        tv6=(TextView)findViewById(R.id.ttvb5);
        tv7=(TextView)findViewById(R.id.ttvb6);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(triceps.this,t1.class));
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(triceps.this,t2.class));
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(triceps.this,t3.class));
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(triceps.this,t4.class));
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(triceps.this,t5.class));
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(triceps.this,t6.class));
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(triceps.this,t7.class));
            }
        });
    }
}
