package com.themap.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Quitar el ActionBar
        Objects.requireNonNull(this.getSupportActionBar()).hide();

    }

    //Técnica 2. Definir un método que atienda todos los onLick de los tres botones y se asigna
    // este método en el diseño del layout (archivo XML).
    public void onClick(View v){
        //View -> prototipo genérico
        //Propiedad tag (desde el view)
        String tag = v.getTag().toString();
        Log.d("onClick", "Hizo click en la "+tag);

        //Recuperando el texto del Button.
        String txtBoton = ((Button)v).getText().toString();
        Log.d("onClick", "Hizo click en la "+txtBoton);

        // TODO: Deplegar un mensaje (toast) con la opción seleccionada.
        //Resuelto el día ...
        String strMensaje = "Hizo click en la " +tag;
        Toast.makeText(this, strMensaje, Toast.LENGTH_LONG).show();
    }

        /*//Técnica 1. Requiere definir una variable por cada uno de los widgets(buttons) sobre los
        // que se desea agregar código que se ejecuta al presionarlo
        Button btnOptionOne = findViewById(R.id.btnOptionOne);
        Button btnOptionTwo = findViewById(R.id.btnOptionTwo);
        Button btnOptionThree = findViewById(R.id.btnOptionThree);

        btnOptionOne.setOnClickListener(v -> {
            // Escribir un mensaje en el Log
            Log.d("onClick", "Hizo click en la opción uno");
        });

        btnOptionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("onClick", "Hizo click en la opción dos");
            }
        });

        btnOptionThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("onClick", "Hizo click en la opción tres");
            }
        });*/

        //Intendando conectar con la base de datos
        //Log.d("onClick", "Intentando conectar con la base de datos");

}