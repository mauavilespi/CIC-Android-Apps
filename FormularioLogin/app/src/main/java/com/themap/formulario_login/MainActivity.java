package com.themap.formulario_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Quitar actionBar
        Objects.requireNonNull(this.getSupportActionBar()).hide();
    }

    //Definir el método que va a asociarse al onClick del Button
    // y desplegar un Toast en la pantalla del dispositivo móvil.
    public void onClickButton(View view) {
        //Recuperar el email y password escritos.
        EditText editTextUsuario = this.findViewById(R.id.editTextUsuario);
        EditText editTextPassword = this.findViewById(R.id.editTextPassword);
        String strEmail = editTextUsuario.getText().toString();
        String strPassword = editTextPassword.getText().toString();
        String strMensaje = "Bienvenido: \n" + "Usuario: " + strEmail + "\n" +
                "Password: " + strPassword;

        //Mostrar el toast correspondiente.
        Toast.makeText(this, strMensaje, Toast.LENGTH_LONG).show();

        //Abrevieando recuperar el password,
        // String strPassword = ((EditText)findViewById(R.id.editTextPassword)).getText().toString();

    }
}

