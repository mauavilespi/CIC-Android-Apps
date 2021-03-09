package mx.ipn.cic.geo.buttons;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

// Forma 1 para atender el onClick que se hace sobre cada botón
// se debe observar que se debe definir una variable de clase para guardar
// una referencia al botón, y después definir un anoninomous inner class definition
// e implementar el onClick para cada botón.

//public class MainActivity extends AppCompatActivity {
//    Button btnOpcionUno;
//    Button btnOpcionDos;
//    Button btnOpcionTres;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Quitar el ActionBar.
//        Objects.requireNonNull(this.getSupportActionBar()).hide();
//
//        // Recuperar las referencias a cada botón.
//        this.btnOpcionUno = this.findViewById(R.id.btnOpcionUno);
//        this.btnOpcionDos = this.findViewById(R.id.btnOpcionDos);
//        this.btnOpcionTres = this.findViewById(R.id.btnOpcionTres);
//
//        // Escribir el código para cuando se hace click sobre cada botón.
//        this.btnOpcionUno.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("onCreate", "Hizo click en la opción 1");
//            }
//        });
//
//        this.btnOpcionDos.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("onCreate", "Hizo click en la opción 2");
//            }
//        });
//
//        this.btnOpcionTres.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("onCreate", "Hizo click en la opción 3");
//            }
//        });
//
//    }
//}

// Forma 2 para atender el onClick que se hace sobre cada botón.
// Se define un método y en el diseño del layout se asigna el método a la propiedad
// onClick para que se invoque el método asignado.

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Quitar el ActionBar.
        Objects.requireNonNull(this.getSupportActionBar()).hide();
    }

    public void onClick(View view) {
        // Recuperar el texto mediante la propiedad TAG.
        String strTextoTag = view.getTag().toString();
        Log.i("onClick", "Hizo click en la " + strTextoTag);
    };
}