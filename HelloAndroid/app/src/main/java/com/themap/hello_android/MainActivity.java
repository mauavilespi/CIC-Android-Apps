package com.themap.hello_android;

//Librerías que se van a usar
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    // Ejemplo de un programa en Android.
    //En el archivo java se persigue colocar toda la lógica de la app.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Quitar el ActionBar.
        Objects.requireNonNull(this.getSupportActionBar()).hide();
    }
}