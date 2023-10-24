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

    TextView nombreDos;
    ImageView fotomono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        nombreDos = findViewById(R.id.nombreDos);
        fotomono = findViewById(R.id.fotomono);

        Bundle nombreDatos = getIntent().getExtras();
        String nombreP = nombreDatos.getString("nombre");

        nombreDos.setText("Hola "+ nombreP+ "!");

        if (nombreP != null && nombreP.equalsIgnoreCase("mono")) {
            fotomono.setImageResource(R.drawable.mono);
            fotomono.setVisibility(View.VISIBLE); // Muestra la foto si el nombre es "mono"
        } else {
            fotomono.setVisibility(View.GONE); // Oculta la foto si el nombre no es "mono"
        }
    }

}
