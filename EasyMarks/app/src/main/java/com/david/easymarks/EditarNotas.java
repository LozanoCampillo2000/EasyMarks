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
        Button btBorrarTodasNotas = (Button) findViewById(R.id.btBorrarTodasNotas);
        Button btVerNotas = (Button) findViewById(R.id.btVerNotas);

        btIntroducirNota.setOnClickListener(this);
        btBorrarNota.setOnClickListener(this);
        btBorrarTodasNotas.setOnClickListener(this);
        btVerNotas.setOnClickListener(this);

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
            case R.id.btBorrarTodasNotas:
                Intent borrar_todas_notas = new Intent(EditarNotas.this, BorrarTodasNotas.class);
                EditarNotas.this.startActivity(borrar_todas_notas);
                break;
            case R.id.btVerNotas:
                Intent ver_notas = new Intent(EditarNotas.this, VerNotas.class);
                EditarNotas.this.startActivity(ver_notas);
                break;
        }
    }
}
