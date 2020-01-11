package com.example.u1ejerciciopropuesto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {

    TextView txtmensaje;
    String nombre;
    String ape;
    int evaluacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        ape = extras.getString("ape");
        txtmensaje = findViewById(R.id.txtmensaje);

        txtmensaje.setText("Bienvenido " + nombre + ape);
    }
}

