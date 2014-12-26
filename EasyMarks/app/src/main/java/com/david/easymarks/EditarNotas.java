package com.david.easymarks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class EditarNotas extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_notas);

        Button btIntroducirNota = (Button) findViewById(R.id.btIntroducirNota);
        Button btBorrarNota = (Button) findViewById(R.id.btBorrarNota);

        btIntroducirNota.setOnClickListener(this);
        btBorrarNota.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btIntroducirNota:
                Intent introducir_nota = new Intent(EditarNotas.this, IntroducirNota.class);
                EditarNotas.this.startActivity(introducir_nota);
                break;
            case R.id.btBorrarNota:
                Intent borrar_nota = new Intent(EditarNotas.this, BorrarNota.class);
                EditarNotas.this.startActivity(borrar_nota);
                break;
        }
    }
}
