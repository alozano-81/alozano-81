package com.example.myaplicaciondeprueba;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myaplicaciondeprueba.databinding.ActivityDinamicoFragBinding;

public class DinamicoFragActivity extends AppCompatActivity {
    boolean cargarFragmanto2 = true;
    private AppBarConfiguration appBarConfiguration;
    private ActivityDinamicoFragBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDinamicoFragBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        /*NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_dinamico_frag);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);*/
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
                Fragment f = null;
                if(cargarFragmanto2){
                   f = new Segundoragment();
                }else{
                   f = new PrimerFragment();
                }

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container2, f)
                        .commit();
                cargarFragmanto2 = !cargarFragmanto2;
            }
        });

        //rescate fragmentos
         getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container2, new PrimerFragment())
                .commit();

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_dinamico_frag);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}