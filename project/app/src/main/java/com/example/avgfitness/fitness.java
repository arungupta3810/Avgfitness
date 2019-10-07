package com.example.avgfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class fitness extends AppCompatActivity {
    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        iv1=(ImageView)findViewById(R.id.ivfit);
        iv2=(ImageView)findViewById(R.id.ivfit2);
        iv3=(ImageView)findViewById(R.id.ivfit3);
        iv4=(ImageView)findViewById(R.id.ivfit4);
        iv5=(ImageView)findViewById(R.id.ivfit5);
        iv6=(ImageView)findViewById(R.id.ivfit6);
        iv7=(ImageView)findViewById(R.id.ivfit7);



        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fitness.this,abs.class));
                Toast.makeText(fitness.this, "abs", Toast.LENGTH_SHORT).show();
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fitness.this,biceps.class));
                Toast.makeText(fitness.this, "biceps", Toast.LENGTH_SHORT).show();
            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fitness.this,triceps.class));
                Toast.makeText(fitness.this, "triceps", Toast.LENGTH_SHORT).show();
            }
        });

        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fitness.this,back.class));
                Toast.makeText(fitness.this, "back", Toast.LENGTH_SHORT).show();
            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fitness.this,shoulder.class));
                Toast.makeText(fitness.this, "shoulder", Toast.LENGTH_SHORT).show();
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fitness.this,legs.class));
                Toast.makeText(fitness.this, "legs", Toast.LENGTH_SHORT).show();
            }
        });

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(fitness.this,chest.class));
                Toast.makeText(fitness.this, "chest", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
