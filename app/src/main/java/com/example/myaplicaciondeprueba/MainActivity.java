package com.example.myaplicaciondeprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnControlesFragmentListener {
    TextView texto;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("VER: ","ver todo");
       // texto = findViewById(R.id.tvMsg);
        //texto.setOnClickListener(this);
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorComu, new ControlesFragment()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("VER: ","ver todo start");
        i =2;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("VER: ","ver todo resumen");
        i =3;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("VER: ","ver todo pause");
        i++;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("VER: ","ver todo stop");
        i--;
    }

    public void initSecActivity(View view) {
        Toast.makeText(this,"Mostrar msg", Toast.LENGTH_LONG).show();
        Log.i("v","mostar log");
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.tvMsg) {
            Toast.makeText(this, "Mostrar msg imple: " + id, Toast.LENGTH_LONG).show();
        }else{

        }
    }

    public void initialActivity(View view) {
        //codigo para activity2, intent explicito
        Intent intent2 = new Intent(this,RelativeActivity.class);
        intent2.putExtra("numero",10);
        intent2.putExtra("nombre","Andres");
        startActivity(intent2);
    }

    public void crearAlarma(View view) {
       Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Prueba de inicio alarmar")
                .putExtra(AlarmClock.EXTRA_HOUR, 11)
                .putExtra(AlarmClock.EXTRA_MINUTES, 21);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void llamarTest(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:911"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void llamarImagenView(View view) {
        Intent imginten = new Intent(this,ImagenActivity.class);
        startActivity(imginten);
    }

    public void llamarFracment(View view) {
        Intent imginten = new Intent(this,FracmentosActivity.class);
        startActivity(imginten);
    }

    public void llamarFracmentDinamico(View view) {
        Intent imginten = new Intent(this,DinamicoFragActivity.class);
        startActivity(imginten);
    }

    public void verListafragment(View view) {
        Intent lista = new Intent(this,FracmentListActivity.class);
        startActivity(lista);
    }

    public void llamarComunicacion(View view) {
        Intent comu = new Intent(this,ControlesFragment.class);
        startActivity(comu);
    }

    @Override
    public void botonColorClicked(String color) {
        Toast.makeText(this,"Estoy en color" + color, Toast.LENGTH_LONG).show();
    }

    @Override
    public void botonTextoClicked(String texto) {
        Toast.makeText(this,"Estoy en texto" + texto, Toast.LENGTH_LONG).show();
    }
}