package com.example.u1ejerciciopropuesto1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,
            btnNueve,btnSuma,btnResta,btnMultiplica,btnDivide,btnClean,btnBorrar,btnPunto,btnIgual;
    TextView Resultado;
    double resultado;
    String operador, mostrar , reserva;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void calculadora(View view) {
        startActivity(new Intent(this, Calculadora.class));
    }
    public void salir(View view){
        finish();
    }

    public void alumno(View view) {
        startActivity(new Intent(this, Alumno.class));
    }
}
