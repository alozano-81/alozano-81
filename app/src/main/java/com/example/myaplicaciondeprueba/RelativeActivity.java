package com.example.myaplicaciondeprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class RelativeActivity extends AppCompatActivity {
    RadioGroup grupoAverias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        grupoAverias = (RadioGroup) findViewById(R.id.radioGrupo1);
    }

    public void tipoAveria(View view) {
        CheckBox elementochec = (CheckBox) view;
        boolean chequeado = elementochec.isChecked();

        String tipo = "";
        switch (view.getId()){
            case R.id.checkBox2:
                tipo = "Averiado";
                break;
            case R.id.checkBox3:
                tipo = "Novedad";
                break;
        }
        Toast.makeText(this,tipo +" = "+ chequeado,Toast.LENGTH_LONG).show();
    }

    public void tipoAveriaRAdio(View view) {
        String tipo = "";
        switch (view.getId()){
            case R.id.radioBtn1:
                tipo = "Mecanica";
                break;
            case R.id.radioBtn2:
                tipo = "Averia";
                break;

            case R.id.radioBtn3:
                tipo = "Novedad";
                break;
        }
        Toast.makeText(this,tipo,Toast.LENGTH_LONG).show();
    }

    public void validarBtnRadioValor(View view){
        int idselected  = grupoAverias.getCheckedRadioButtonId();
        String tipo = "";
        switch (idselected){
            case R.id.radioBtn1:
                tipo = "Mecanica";
                break;
            case R.id.radioBtn2:
                tipo = "Averia";
                break;

            case R.id.radioBtn3:
                tipo = "Novedad";
                break;
        }
        Toast.makeText(this,"Seleccion radio: "+tipo+" y "+idselected,Toast.LENGTH_LONG).show();
    }

    public void isCheckeado(View view) {
        ToggleButton elementochec = (ToggleButton) view;
        boolean chequeado = elementochec.isChecked();
        Toast.makeText(this,"==>"+chequeado,Toast.LENGTH_LONG).show();
    }

}