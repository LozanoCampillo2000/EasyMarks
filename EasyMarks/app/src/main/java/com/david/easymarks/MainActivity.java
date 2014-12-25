package com.david.easymarks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsuario = (EditText) findViewById(R.id.etUsuario);
        EditText etContraseña = (EditText) findViewById(R.id.etContraseña);

        final Editable usuario = etUsuario.getText();
        final Editable contraseña = etContraseña.getText();

        Button btIniciarSesión = (Button) findViewById(R.id.btInicioSesión);

        btIniciarSesión.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usuario.toString().equals("David Lozano Campillo") && contraseña.toString().equals("1lk1z1mAlkazam")) {
                    Intent pantalla_principal = new Intent(MainActivity.this, PantallaPrincipal.class);
                    MainActivity.this.startActivity(pantalla_principal);

                    Toast.makeText(getBaseContext(), "Inicio de sesión con éxito", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getBaseContext(), "Inicio de sesión fallido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}