package com.example.myaplicaciondeprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ComunicacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion);

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorComu,new ControlesFragment()).commit();
    }
}