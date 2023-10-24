package com.example.holausuario;

//Importamos las clases correspondientes.

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //Variables
    Button botonSaludo;

    //Funcion onCreate
    //Método que es el primero que se llama cuando la actividad está a punto de ser mostrada al usuario.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vistas NameBoton y BotonSaludo
        TextView NameBoton = findViewById(R.id.nameText);
        botonSaludo = findViewById(R.id.buttonSaludo);

        //Configuraramos una barra de herramientas (toolbar)
        //
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);


        //Creamos el clicklistener para el boton saludo
        botonSaludo.setOnClickListener(new View.OnClickListener() {

            //Aqui manejamos los eventos de clic en las vistas.
            @Override
            public void onClick(View v) {
                Bundle nombreDatos = new Bundle();
                nombreDatos.putString("nombre",NameBoton.getText().toString());

                //La unimos el mainPrincipal con el main numero 2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(nombreDatos);
                startActivity(intent);
            }
        });
    }
}