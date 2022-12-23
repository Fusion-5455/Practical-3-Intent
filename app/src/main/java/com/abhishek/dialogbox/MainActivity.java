package com.abhishek.dialogbox;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText RegNoInput, passwordInput;
    Button loginButton;
    String RegNoField , passwordField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RegNoInput = (EditText) findViewById(R.id.login);
        passwordInput = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(view -> {
            RegNoField = RegNoInput.getText().toString();
            passwordField = passwordInput.getText().toString();

            if(RegNoField.equals("20010765") && passwordField.equals("5455")){
                Toast.makeText(
                        MainActivity.this,
                        "Login Successful !!!",
                        Toast.LENGTH_SHORT
                ).show();
                Intent intent = new Intent(getApplicationContext(),NewActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(
                        MainActivity.this,
                        "Invalid Information :(\nEnter Again!!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}