package com.example.myaplicaciondeprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FracmentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fracment_list);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedorList, AveriaFragment.newInstance(2)).commit();
    }
}