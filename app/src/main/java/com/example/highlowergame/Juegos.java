package com.example.highlowergame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Juegos extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutjuegos);
    }
    public void GoMenu(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}