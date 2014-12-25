package com.david.easymarks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaPrincipal extends Activity implements  View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        Button btEscribirNota = (Button) findViewById(R.id.btIntroducirNotas);
        Button btHacerMedia = (Button) findViewById(R.id.btHacerMedia);

        btEscribirNota.setOnClickListener(this);
        btHacerMedia.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btIntroducirNotas:
                Intent escribir_notas = new Intent(PantallaPrincipal.this, IntroducirNotas.class);
                PantallaPrincipal.this.startActivity(escribir_notas);
                break;
            case R.id.btHacerMedia:
                Intent hacer_media = new Intent(PantallaPrincipal.this, HacerMedia.class);
                PantallaPrincipal.this.startActivity(hacer_media);
                break;
        }
    }
}