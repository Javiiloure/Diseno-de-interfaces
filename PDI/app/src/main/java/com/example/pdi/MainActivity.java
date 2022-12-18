package com.example.pdi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;
import android.view.Menu;

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
           String nombre_cientifico = "Pyrus";

           intent.putExtra("descripcion", descripcion);
           intent.putExtra("nombre_cientifico", nombre_cientifico);
           intent.putExtra("imagen", R.drawable.peral);
           startActivity(intent);
        });

        peral.setOnLongClickListener(view -> {
            new AlertDialog.Builder(this).setTitle("Eliminar planta").setMessage("Quieres eliminar esta planta?").setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, (dialog, whichButton) -> {
                        peral.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Planta eliminada", Toast.LENGTH_SHORT).show();
                    })
                .setNegativeButton(android.R.string.no, null).show();
            return true;
        });

        manzano.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            String descripcion = "Es un árbol de mediano tamaño (4 m de altura), inerme, caducifolio, de copa redondeada abierta y numerosas" +
                    " ramas que se desarrollan casi horizontalmente. El tronco tiene corteza agrietada que se desprende en placas. Las hojas, " +
                    "estipuladas y cortamente pecioladas, son ovaladas, acuminadas u obtusas, de base cuneada o redondeada, generalmente de " +
                    "bordes aserradas pero ocasionalmente sub-enteras, de fuerte color verde y con pubescencia en el envés. Al estrujarlas " +
                    "despiden un agradable aroma.";
            String nombre_cientifico = "Malus domestica";
            intent.putExtra("descripcion", descripcion);
            intent.putExtra("nombre_cientifico", nombre_cientifico);
            intent.putExtra("imagen", R.drawable.manzano);
            startActivity(intent);
        });

        manzano.setOnLongClickListener(view -> {
            new AlertDialog.Builder(this).setTitle("Eliminar planta").setMessage("Quieres eliminar esta planta?").setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, (dialog, whichButton) -> {
                        manzano.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Planta eliminada", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton(android.R.string.no, null).show();
            return true;
        });

        naranjo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            String descripcion = "El naranjo es un árbol de tamaño mediano, de tres a cinco metros de altura, con copa redondeada y ramas " +
                    "regulares. Un solo tronco, derecho y cilíndrico, verdoso primero y gris después. Las ramas aparecen a un metro, poco más" +
                    " o menos, del suelo. Las hojas son perennes, medianas y alargadas, con base redondeada y terminadas en punta. Las flores" +
                    " aparecen en las axilas de las hojas, solitarias o en racimos.";
            String nombre_cientifico = "Citrus × sinensis";
            intent.putExtra("descripcion", descripcion);
            intent.putExtra("nombre_cientifico", nombre_cientifico);
            intent.putExtra("imagen", R.drawable.naranjo);
            startActivity(intent);
        });

        naranjo.setOnLongClickListener(view -> {
            new AlertDialog.Builder(this).setTitle("Eliminar planta").setMessage("Quieres eliminar esta planta?").setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, (dialog, whichButton) -> {
                        naranjo.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Planta eliminada", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton(android.R.string.no, null).show();
            return true;
        });

        limonero.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            String descripcion = "Es un árbol perenne, a menudo con espinas, que puede alcanzar los cuatro metros de altura, con copa abierta muy" +
                    " ramificada. Sus hojas son alternas, simples, coriáceas, con limbo elíptico de margen más o menos cerrado, glanduloso; a su vez" +
                    " contiene una nervadura penninervial. La inserción de su tallo es peciolada y su disposición es alterna. Es de color verde mate " +
                    "lustroso de unos 5-10 cm de largo y con peciolo cilíndrico articulado. Las flores, comúnmente llamadas (al igual que las del " +
                    "naranjo) azahares o flores de azahar, son solitarias o se organizan en pares o cortas inflorescencias corimbosas axilares. ";
            String nombre_cientifico = "Citrus x Limon";
            intent.putExtra("descripcion", descripcion);
            intent.putExtra("nombre_cientifico", nombre_cientifico);
            intent.putExtra("imagen", R.drawable.limonero);
            startActivity(intent);
        });

        limonero.setOnLongClickListener(view -> {
            new AlertDialog.Builder(this).setTitle("Eliminar planta").setMessage("Quieres eliminar esta planta?").setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, (dialog, whichButton) -> {
                        limonero.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Planta eliminada", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton(android.R.string.no, null).show();
            return true;
        });

        lavanda.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            String descripcion = "Son plantas sufruticosas, perennes de tallos de sección cuadrangular, generalmente muy foliosos en la parte inferior," +
                    " con hojas de estrechamente lanceoladas a anchamente elípticas, enteras, dentadas o varias veces divididas, con pelos simples," +
                    " ramificados y glandulíferos. La inflorescencia es espiciforme, formada por verticilastros más o menos próximos, con frecuencia con " +
                    "largos escapos. Las brácteas son diferentes de las hojas, frecuentemente coloreadas, las superiores, a veces, muy diferentes y" +
                    " sobresalientes en penacho o corona. El cáliz tiene cinco dientes triangulares pequeños, el superior generalmente acabado en un apéndice" +
                    " más o menos elíptico, en forma de pequeño opérculo que cierra la garganta del cáliz; el tubo de este último presenta de ocho a quince " +
                    "nervios y no tiene anillo interno de pelos (carpostegio).";
            String nombre_cientifico = "Lavandula";
            intent.putExtra("descripcion", descripcion);
            intent.putExtra("nombre_cientifico", nombre_cientifico);
            intent.putExtra("imagen", R.drawable.lavanda);
            startActivity(intent);
        });

        lavanda.setOnLongClickListener(view -> {
            new AlertDialog.Builder(this).setTitle("Eliminar planta").setMessage("Quieres eliminar esta planta?").setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, (dialog, whichButton) -> {
                        lavanda.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Planta eliminada", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton(android.R.string.no, null).show();
            return true;
        });

        aloevera.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            String descripcion = "Arbusto acaule o con tallo corto de hasta 30 cm, erecto, sin rebrotes laterales. Las hojas, que pueden medir hasta 40-50 cm" +
                    " de largo por 10-15 cm de ancho en ejemplares adultos, se disponen en forma de roseta basal. Son estrechamente triangular-lanceoladas," +
                    " canaliculadas, rectas, erecto-patentes, herbáceas, de un verde-grisáceo, glaucas, ligeramente recubiertas de pruina y sin manchas —excepto" +
                    " unas motas alargadas y claras en los hijuelos y en la base de algunas hojas más viejas—, dentadas solo en el margen, con dientes de unos" +
                    " 2 mm, gruesos, duros, retrorsos, de un color más claro que el del limbo.";
            String nombre_cientifico = "Aloe vera";
            intent.putExtra("descripcion", descripcion);
            intent.putExtra("nombre_cientifico", nombre_cientifico);
            intent.putExtra("imagen", R.drawable.aloevera);
            startActivity(intent);
        });

        aloevera.setOnLongClickListener(view -> {
            new AlertDialog.Builder(this).setTitle("Eliminar planta").setMessage("Quieres eliminar esta planta?").setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, (dialog, whichButton) -> {
                        aloevera.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Planta eliminada", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton(android.R.string.no, null).show();
            return true;
        });

        tulipan.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            String descripcion = "Son plantas herbáceas y bulbosas. Los bulbos son truncados basalmente y elongados hacia el ápice, cubiertos por una túnica usualmente" +
                    " pilosa por dentro. El tallo es simple (ocasionalmente ramificado) y subterráneo en su porción basal. Las hojas son basales y caulinares, espaciadas" +
                    " o más o menos arrosetadas, lineales, aovadas o lanceoladas.";
            String nombre_cientifico = "Tulipa";
            intent.putExtra("descripcion", descripcion);
            intent.putExtra("nombre_cientifico", nombre_cientifico);
            intent.putExtra("imagen", R.drawable.tulipan);
            startActivity(intent);
        });

        tulipan.setOnLongClickListener(view -> {
            new AlertDialog.Builder(this).setTitle("Eliminar planta").setMessage("Quieres eliminar esta planta?").setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, (dialog, whichButton) -> {
                        tulipan.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Planta eliminada", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton(android.R.string.no, null).show();
            return true;
        });

        rosa.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Planta.class);
            String descripcion = "Los rosales son arbustos o trepadoras (a veces colgantes), generalmente espinosos, que alcanzan de dos a cinco metros de altura, en ocasiones, pueden llegar a los 20 m trepando sobre otras plantas." +
                    "Tienen tallos semileñosos, casi siempre erectos (a veces rastreros), algunos de textura rugosa y escamosa. Presentan notables formaciones epidérmicas persistentes, bien desarrolladas y de formas variadas, conocidas" +
                    "como espinas o aguijones. Las hojas pueden ser perennes o caducas, pecioladas e imparipinnadas con cinco a nueve folíolos de borde aserrado y estípulas basales. Es frecuente la presencia de glándulas anexas," +
                    " odoríferas o no, sobre los márgenes.";
            String nombre_cientifico = "Rosa";
            intent.putExtra("descripcion", descripcion);
            intent.putExtra("nombre_cientifico", nombre_cientifico);
            intent.putExtra("imagen", R.drawable.rosa);
            startActivity(intent);
        });

        rosa.setOnLongClickListener(view -> {
            new AlertDialog.Builder(this).setTitle("Eliminar planta").setMessage("Quieres eliminar esta planta?").setIcon(android.R.drawable.ic_dialog_alert)
                    .setPositiveButton(android.R.string.yes, (dialog, whichButton) -> {
                        rosa.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "Planta eliminada", Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton(android.R.string.no, null).show();
            return true;
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.logout) {
            Intent intent = new Intent(MainActivity.this, Login.class);
            Toast.makeText(this, "Cerrando Sesion", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}