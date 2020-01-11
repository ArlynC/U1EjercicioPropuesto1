package com.example.u1ejerciciopropuesto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class Alumno extends AppCompatActivity {

    Spinner mispinner1;
    Spinner mispinner2;
    String miitem;
    String gi;
    EditText edtDescripcion;
    EditText edtgi;
    EditText edtnombre;
    EditText edtape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);
        edtnombre=findViewById(R.id.edtnombre);
        edtape=findViewById(R.id.edtape);
        mispinner1=findViewById(R.id.spSe);
        mispinner2=findViewById(R.id.spgi);
        edtDescripcion=findViewById(R.id.edtsexo);
        edtgi=findViewById(R.id.edtgrado);
        mispinner1
                .setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0,
                                               View arg1, int position, long arg3) {
// TODO Auto-generated method stub

                        miitem= (String) mispinner1.getSelectedItem();
                        gi=(String) mispinner2.getSelectedItem();

                        edtDescripcion.setText(miitem);
                        edtgi.setText(gi);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub
                    }
                });
    }
    public void Verificar(View view){
        Intent intent = new Intent(this, Bienvenido.class);
        intent.putExtra("nombre", edtnombre.getText().toString());
        intent.putExtra("edad", Integer.parseInt(edtape.getText().toString()));
        startActivity(intent);
    }
}
