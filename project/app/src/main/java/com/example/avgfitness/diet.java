package com.example.avgfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class diet extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        b1=(Button) findViewById(R.id.dietplan);
        b3=(Button) findViewById(R.id.dietplan2);
        b2=(Button) findViewById(R.id.dietplan1);
        b4=(Button) findViewById(R.id.dietplan3);
        b5=(Button) findViewById(R.id.dietplan4);
        b6=(Button) findViewById(R.id.dietplan5);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(diet.this,keto.class));
                Toast.makeText(diet.this, "weight loss plan", Toast.LENGTH_SHORT).show();



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(diet.this,ormal.class));
                Toast.makeText(diet.this, " maintenance diet plan", Toast.LENGTH_SHORT).show();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(diet.this,massgainer.class));
                Toast.makeText(diet.this, "weight gain plan", Toast.LENGTH_SHORT).show();


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(diet.this,diet.class));
                Toast.makeText(diet.this, "Locked", Toast.LENGTH_SHORT).show();


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(diet.this,diet.class));
                Toast.makeText(diet.this, "Locked", Toast.LENGTH_SHORT).show();


            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(diet.this,diet.class));
                Toast.makeText(diet.this, "Locked", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
