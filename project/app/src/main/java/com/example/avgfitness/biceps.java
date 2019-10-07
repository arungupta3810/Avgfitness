package com.example.avgfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class biceps extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);
        tv1=(TextView)findViewById(R.id.tvb0);
        tv2=(TextView)findViewById(R.id.tvb1);
        tv3=(TextView)findViewById(R.id.tvb2);
        tv4=(TextView)findViewById(R.id.tvb3);
        tv5=(TextView)findViewById(R.id.tvb4);
        tv6=(TextView)findViewById(R.id.tvb5);
        tv7=(TextView)findViewById(R.id.tvb6);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biceps.this,b1.class));
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biceps.this,b2.class));
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biceps.this,b3.class));
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biceps.this,b4.class));
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biceps.this,b5.class));
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biceps.this,b6.class));
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(biceps.this,b7.class));
            }
        });

    }
}
