package com.example.carrusel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagen = findViewById(R.id.imagen);
        FloatingActionButton avanzar = findViewById(R.id.avanzar);
        FloatingActionButton retrodecer = findViewById(R.id.retroceder);

        String [] lenguajes = getResources().getStringArray(R.array.lenguajes);
        AutoCompleteTextView text = findViewById(R.id.text);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, lenguajes);
        text.setAdapter(adapter);

        imagen.setImageResource(R.drawable.java);

        avanzar.setOnClickListener(view -> {
            count++;
            if(count == 1) {
                imagen.setImageResource(R.drawable.java);
            } else if(count == 2) {
                imagen.setImageResource(R.drawable.c);
            } else if (count == 3) {
                imagen.setImageResource(R.drawable.python);
            } else if (count == 4) {
                imagen.setImageResource(R.drawable.ruby);
            } else if (count == 5) {
                imagen.setImageResource(R.drawable.sql);
            } else {
                count = 5;
            }
        });

        retrodecer.setOnClickListener(view -> {
            count--;
            if(count == 1) {
                imagen.setImageResource(R.drawable.java);
            } else if(count == 2) {
                imagen.setImageResource(R.drawable.c);
            } else if (count == 3) {
                imagen.setImageResource(R.drawable.python);
            } else if (count == 4) {
                imagen.setImageResource(R.drawable.ruby);
            } else if (count == 5) {
                imagen.setImageResource(R.drawable.sql);
            } else {
                count = 1;
            }
        });
    }
}