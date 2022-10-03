package com.example.primerainterfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputEmail = (EditText) findViewById(R.id.inputEmail);
        String email = inputEmail.getText().toString();

        EditText inputNombre = (EditText) findViewById(R.id.inputNombre);
        String nombre = inputNombre.getText().toString();

        EditText inputApellidos = (EditText) findViewById(R.id.inputApellidos);
        String apellidos = inputApellidos.getText().toString();

        EditText inputContraseña = (EditText) findViewById(R.id.inputRepContraseña);
        String contraseña = inputContraseña.getText().toString();

        EditText inputRepContraseña = (EditText) findViewById(R.id.inputRepContraseña);
        String repContraseña = inputRepContraseña.getText().toString();

        Button registrarse = (Button) findViewById(R.id.registrarse);
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }
}