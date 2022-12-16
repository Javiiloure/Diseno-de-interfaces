package com.example.pdi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Bitmap;

public class Planta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planta);

        String descripcion = getIntent().getExtras().getString("descripcion");
        String regadio = getIntent().getExtras().getString("regadio");
        int foto = getIntent().getExtras().getInt("imagen");

        ImageView imagen = findViewById(R.id.foto_planta);
        TextView texto_descripcion = findViewById(R.id.descripcion);
        TextView texto_regadio = findViewById(R.id.regadio);

        imagen.setImageResource(foto);
        texto_descripcion.setText(descripcion);
        texto_regadio.setText(regadio);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}