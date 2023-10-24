package com.example.holausuario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    //Variables Main2
    TextView nombreDos;
    ImageView fotomono;
    @Override
    //Inicializamos la actividad en la interfaz
    protected void onCreate(Bundle savedInstanceState) {
        //Llamamos a oncreate para que la inicialice correctamente
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Vista toolbar el el diseño (design)
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        //Aqui pondremos la flecha para ir al anterior main.
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        //Buscan los identificados de las variables.
        nombreDos = findViewById(R.id.nombreDos);
        fotomono = findViewById(R.id.fotomono);

        Bundle nombreDatos = getIntent().getExtras();
        String nombreP = nombreDatos.getString("nombre");

        //Saludamos con el nombre escrito por el usuario
        nombreDos.setText("Hola "+ nombreP+ "!");

        //Si el nombre es igual a mono, nos aparecera una foto de un pono en modo Visible
        if (nombreP != null && nombreP.equalsIgnoreCase("mono")) {
            fotomono.setImageResource(R.drawable.mono);
            fotomono.setVisibility(View.VISIBLE); // Muestra la foto si el nombre es "mono"
        } else {
            fotomono.setVisibility(View.GONE); // Oculta la foto si el nombre no es "mono"
        }
    }

}
