package com.example.avgfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgotpassword extends AppCompatActivity {

    private Button b1;
    private EditText ed1;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        b1=(Button)findViewById(R.id.btf1);
        ed1=(EditText) findViewById(R.id.edf1);
        mAuth= FirebaseAuth.getInstance();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=ed1.getText().toString().trim();
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(forgotpassword.this, "please enter your registered email", Toast.LENGTH_SHORT).show();
                }
                else{
                    mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(forgotpassword.this, "password reset email sent", Toast.LENGTH_SHORT).show();
                                finish();
                                startActivity(new Intent(forgotpassword.this,login.class));
                            }
                            else{
                                Toast.makeText(forgotpassword.this, "error in sending password reset email", Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
