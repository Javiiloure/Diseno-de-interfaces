package com.example.pdi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView portada = findViewById(R.id.portada);
        Intent intent = new Intent(SplashScreen.this, Login.class);
        Timer t = new Timer();

        t.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        }, 3000);

        portada.setOnClickListener(view -> {
            t.cancel();
            startActivity(intent);
        });
    }
}