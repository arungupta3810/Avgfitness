package com.example.avgfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        final EditText ed1=(EditText)findViewById(R.id.feeduser);
        final EditText ed2=(EditText)findViewById(R.id.enterfeed);
        Button b1=(Button) findViewById(R.id.sendfeed);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL, new String("abcd@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT, "feedback from app");
                i.putExtra(Intent.EXTRA_TEXT, "Name:" + ed1.getText() + "\n Message:" + ed2.getText());
                try {
                    startActivity(Intent.createChooser(i, "please select email"));
                } catch (android.content .ActivityNotFoundException exception){
                    Toast.makeText(feedback.this, "Ther are no email clients", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
