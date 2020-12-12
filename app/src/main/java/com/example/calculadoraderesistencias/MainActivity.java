package com.example.calculadoraderesistencias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }


    public void Ir(View view) {
             Intent i = new Intent(this, Resistencia_Serie.class );
             startActivity(i);
    }

    public void Ir2(View view) {
        Intent i = new Intent(this, Resistencia_Paralela.class );
        startActivity(i);
    }

    public void Ir3(View view) {
        Intent i = new Intent(this, Formulas.class );
        startActivity(i);
    }



}
