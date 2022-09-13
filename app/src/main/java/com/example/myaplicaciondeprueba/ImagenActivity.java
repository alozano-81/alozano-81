package com.example.myaplicaciondeprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

public class ImagenActivity extends AppCompatActivity {
    ImageView logotipo;
    ImageView logotipo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen);
        logotipo = (ImageView) findViewById(R.id.logotipoInternet);
        logotipo2 = (ImageView) findViewById(R.id.logotipoGlideInternet);
        Picasso.get()
               .load("https://i.imgur.com/DvpvklR.png")
                .resize(200,100)
                .centerCrop()
              .into(logotipo);

        RequestOptions opt = new RequestOptions().fitCenter();
        Glide.with(this)
                .load("https://i.imgur.com/DvpvklR.png")
                .apply(opt)
                .into(logotipo2);
    }
}