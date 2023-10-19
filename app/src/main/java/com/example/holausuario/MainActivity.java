package com.example.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonSaludo = findViewById(R.id.buttonSaludo);
        TextView NameBoton = findViewById(R.id.recibirNombre);

        botonSaludo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                    String nombre = NameBoton.getText().toString();
                    NameBoton.setText("Hola " + nombre + " encantado de conocerte!");




            }
        });
    }
}