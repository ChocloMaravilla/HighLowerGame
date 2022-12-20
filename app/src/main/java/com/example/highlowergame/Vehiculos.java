package com.example.highlowergame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Vehiculos extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutvehiculos);
    }
    public void GoMenu(View view){
        Intent intent1 = new Intent(this,MainActivity.class);
        startActivity(intent1);
    }
}
