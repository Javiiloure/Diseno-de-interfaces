package com.example.pdi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView peral = findViewById(R.id.peral);
        CardView manzano = findViewById(R.id.manzano);
        CardView naranjo = findViewById(R.id.naranjo);
        CardView limonero = findViewById(R.id.limonero);
        CardView lavanda = findViewById(R.id.lavanda);
        CardView aloevera = findViewById(R.id.aloevera);
        CardView tulipan = findViewById(R.id.tulipan);
        CardView rosa = findViewById(R.id.rosa);

        peral.setOnClickListener(view -> {
           Intent intent = new Intent(MainActivity.this, Planta.class);
           String descripcion = "Los perales suelen adoptar forma arbórea. Son árboles de tamaño mediano, que alcanzan de media 10–17 m de alto, " +
                   "a menudo con una coronación alta y estrecha; unas pocas especies son arbustivas. El peral silvestre alcanza unos 20 metros" +
                   " de alto, que es lo que pueden alcanzar también algunas variedades cultivadas. Las especies más bajas tienen su límite en " +
                   "los 12 metros, como ocurre con el peral de hojas de almendro y el peral de las nieves. La corteza de los perales es pardo " +
                   "negruzca, con placas nudosas y oblongas en el peral común y con grietas transversales y longitudinales en el peral silvestre." +
                   " Dentro de este tono, hay especies con la corteza pardo grisácea más clara (como el peral de Callery) y otras que lo" +
                   " tienen más oscuro, como el peral de hojas de almendro o el de las nieves. Llega a ser de color negro en el peral de " +
                   "hojas de sauce. Una característica de las ramas o brotes de los perales silvestres es que son espinosas, aunque esto no " +
                   "suele ocurrir en los perales cultivados. En cuanto a las hojas, son alternas y de formas variadas, pero en términos generales" +
                   " puede decirse que son ovaladas, pecioladas y agudas. La longitud de las hojas, en el peral común se sitúa entre los 3 y los 8 " +
                   "centímetros. Las del peral silvestre suelen ser más pequeñas, 4 cm. Las más grandes son las del peral Nashi que llegan hasta los " +
                   "10 centímetros. El borde suele ser finamente serrado, pero alguna especie carece de tales dientes, como Pyrus salvifolia.";
           String regadio = "Riega bien y continua regando regularmente – una o dos veces por semana";

           intent.putExtra("descripcion", descripcion);
           intent.putExtra("regadio", regadio);
           intent.putExtra("imagen", R.drawable.peral);

           startActivity(intent);
        });

        manzano.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            startActivity(intent);
        });

        naranjo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            startActivity(intent);
        });

        limonero.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            startActivity(intent);
        });

        lavanda.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            startActivity(intent);
        });

        aloevera.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            startActivity(intent);
        });

        tulipan.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            startActivity(intent);
        });

        rosa.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            startActivity(intent);
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}