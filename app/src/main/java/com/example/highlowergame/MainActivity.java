package com.example.highlowergame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button Actores;
    Button Vehiculos;
    Button Juegos;
    Button All;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Actores = findViewById(R.id.Actores);
        Vehiculos = findViewById(R.id.Vehiculos);
        Juegos = findViewById(R.id.Juegos);
        All = findViewById(R.id.All);
    }
    public void GoActores(View view){
        Intent i = new Intent(this,Actores.class);
        startActivity(i);
    }
    public void GoVehiculos(View view){
        Intent i = new Intent(this,Vehiculos.class);
        startActivity(i);
    }
    public void GoJuegos(View view){
        Intent i = new Intent(this,Juegos.class);
        startActivity(i);
    }
    public void GoAll(View view){
        Intent i = new Intent(this,All.class);
        startActivity(i);
    }
}