package com.david.easymarks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaPrincipal extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        Button btEditarNotas = (Button) findViewById(R.id.btEditarNotas);
        Button btVerNotas = (Button) findViewById(R.id.btVerNotas);
        Button btHacerMedia = (Button) findViewById(R.id.btHacerMedia);

        btEditarNotas.setOnClickListener(this);
        btVerNotas.setOnClickListener(this);
        btHacerMedia.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btEditarNotas:
                Intent escribir_notas = new Intent(PantallaPrincipal.this, EditarNotas.class);
                PantallaPrincipal.this.startActivity(escribir_notas);
                break;
            case R.id.btHacerMedia:
                Intent hacer_media = new Intent(PantallaPrincipal.this, HacerMedia.class);
                PantallaPrincipal.this.startActivity(hacer_media);
                break;
            case R.id.btVerNotas:
                Intent ver_notas = new Intent(PantallaPrincipal.this, VerNotas.class);
                PantallaPrincipal.this.startActivity(ver_notas);
                break;
        }
    }
}