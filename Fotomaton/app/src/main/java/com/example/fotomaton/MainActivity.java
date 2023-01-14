package com.example.fotomaton;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;

import android.os.Environment;
import android.provider.MediaStore;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ImageView foto;
    private EditText titulo;
    private Bitmap bitmap;
    private CalendarView calendarView;
    private String fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asignamos los elemntos del layout a sus variables
        FloatingActionButton camara = findViewById(R.id.camara);
        FloatingActionButton guardar = findViewById(R.id.guardar);
        foto = findViewById(R.id.foto);
        titulo = findViewById(R.id.titulo);
        calendarView = findViewById(R.id.calendarView);

        // La fecha por defecto será el dia actual, se cambiara si se toca el CalendarView
        fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

        // Cuando se pulse el boton de la camara se abriara la camara
        camara.setOnClickListener(view -> abrirCamara());

        // Cuando se pulse el boton de guardar se guardara la imagen en una carpeta llamada Fotomaton en el almacenamiento interno del telefono
        guardar.setOnClickListener(view -> {
           try {
               guardarImagen(bitmap);
           } catch (Exception e) {
               e.printStackTrace();
           }
        });

        // Comprobamos cuando se cambie la fecha en el calendarview y cambiamos la String fecha
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                month = month + 1;
                fecha = day + "-" + month + "-" + year;
                Log.d(TAG, "onSelectedDayChage: date " + fecha);
            }
        });
    }

    // Abrimos la camara
    public void abrirCamara(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 1);
        }
    }

    // Funcion para guardar imagen que se inicia cuandos e pulse el boton
    public void guardarImagen(Bitmap bitmap) throws IOException {

        String sdcard = Environment.getExternalStorageDirectory().toString();
        File ruta = new File(sdcard + "/DCIM/Fotomaton");
        ruta.mkdirs();
        String nombre_foto;

        // Si el titulo de la foto esta vacio se mostrara una notificacion y no se guardara
       if(titulo.getText().toString().equals("")) {
           Toast.makeText(MainActivity.this, "El titulo esta vacio", Toast.LENGTH_SHORT).show();
           return;
       } else {
           // Si el titulo contiene texto se obtendra ese texto y se guardara junto con la fecha en la String nombre_foto
           nombre_foto = titulo.getText() + "_" + fecha +".jpg";
       }

        File file = new File(ruta, nombre_foto);
        if (file.exists()) file.delete();
        FileOutputStream fos = new FileOutputStream(file);

        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);

        fos.flush();
        fos.close();

        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(file)));
        MediaScannerConnection.scanFile(this, new String[]{file.toString()}, new String[]{file.getName()}, null);
        Toast.makeText(MainActivity.this, "Imagen guardada", Toast.LENGTH_SHORT).show();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            bitmap = (Bitmap) extras.get("data");
            foto.setImageBitmap(bitmap);
        }
    }

    // Cargamos el menu creado en el xml menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.cerrar) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}