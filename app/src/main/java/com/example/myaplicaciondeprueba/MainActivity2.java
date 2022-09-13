package com.example.myaplicaciondeprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        Bundle parametrosExtras = getIntent().getExtras();
        int n= parametrosExtras.getInt("numero");
        String nombre = parametrosExtras.getString("nombre");
        Toast.makeText(this,"Numero:" + n + " y nombre: "+ nombre,Toast.LENGTH_LONG).show();
    }
}