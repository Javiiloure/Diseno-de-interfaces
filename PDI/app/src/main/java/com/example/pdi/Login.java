package com.example.pdi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.login_button);
        Intent intent = new Intent(Login.this, MainActivity.class);

        login.setOnClickListener(view -> {
            startActivity(intent);
            finish();
        });
    }
}