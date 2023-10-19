package com.example.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button botonSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView NameBoton = findViewById(R.id.nameText);
        botonSaludo = findViewById(R.id.buttonSaludo);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);


        botonSaludo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle nombreDatos = new Bundle();
                nombreDatos.putString("nombre",NameBoton.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(nombreDatos);
                startActivity(intent);


            }
        });
    }
}