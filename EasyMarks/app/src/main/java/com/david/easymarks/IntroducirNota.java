package com.david.easymarks;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class IntroducirNota extends Activity {

    public String asignatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_nota);

        final EditText etNota = (EditText) findViewById(R.id.etNota);
        final EditText etFecha = (EditText) findViewById(R.id.etFecha);

        Button btIntroducirNotaAceptar = (Button) findViewById(R.id.btIntroducirNotaAceptar);

        Spinner spinner = (Spinner) findViewById(R.id.spAsignatura);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Asignaturas, android.R.layout.simple_spinner_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                asignatura = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btIntroducirNotaAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etNota.getText().toString().equals("") || etFecha.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Rellena todas las casillas", Toast.LENGTH_SHORT).show();
                }
                else {
                    //TODO Base de Datos
                    Toast.makeText(getApplicationContext(), "Nota introducida correctamente", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
