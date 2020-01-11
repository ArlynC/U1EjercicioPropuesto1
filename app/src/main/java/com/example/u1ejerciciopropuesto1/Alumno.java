package com.example.u1ejerciciopropuesto1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Alumno extends AppCompatActivity {

    Spinner mispinner1;
    Spinner mispinner2;
    String miitem;
    String gi;
    EditText edtDescripcion;
    EditText edtgi;
    EditText edtnombre;
    EditText edtape;

    EditText etBirthday;
    Calendar myCalendar = Calendar.getInstance();

    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            actualizarInput();
        }

    };
    private void actualizarInput() {
        String formatoDeFecha = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(formatoDeFecha, Locale.US);

        etBirthday.setText(sdf.format(myCalendar.getTime()));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);

        etBirthday = findViewById(R.id.edtfecha);
        etBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(Alumno.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });


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
        intent.putExtra("ape", edtape.getText().toString());
        startActivity(intent);
    }
}
