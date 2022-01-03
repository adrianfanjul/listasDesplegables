package com.tokioschol.listasdesplegables;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;
import com.tokioschol.listasdesplegables.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        listeners();
        Glide.with(this)
                .load("https://aprendelibvrefiles.blob.core.windows.net/aprendelibvre-container/course/creacion_de_sitios_web/image/imgscursoweb-01_xl.png")
                .into(binding.cardActivity.cardviewCardImg);
    }

    private void listeners() {

            binding.mainActivitySpinnerDeclarativo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("LongLogTag")
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String frutaSeleccionada="Ninguna";
                if(adapterView.getItemAtPosition(position) instanceof String){
                    frutaSeleccionada=(String) adapterView.getItemAtPosition(position);
                }
                Log.i("Selected item getItemAt :", frutaSeleccionada);
                String item=binding.mainActivitySpinnerDeclarativo.getSelectedItem().toString();
                Log.i("Selected item :", item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //ESCOGER SEGUN QUE QUIERAS PROBAR
        binding.mainAceptarBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,DataBindingExample.class)));
        //botonAceptar.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,CardViewActivity.class)));

    }


}