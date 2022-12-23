package com.abhishek.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//        btn = findViewById(R.id.signUpBtn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(SignUpActivity.this, "Sign Up Successful :)", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(getApplicationContext(),NewActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}