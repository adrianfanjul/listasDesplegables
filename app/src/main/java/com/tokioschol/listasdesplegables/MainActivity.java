package com.tokioschol.listasdesplegables;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private MaterialButton botonAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        listeners();
    }

    private void listeners() {

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("LongLogTag")
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String frutaSeleccionada="Ninguna";
                if(adapterView.getItemAtPosition(position) instanceof String){
                    frutaSeleccionada=(String) adapterView.getItemAtPosition(position);
                }
                Log.i("Selected item getItemAt :", frutaSeleccionada);
                String item=spinner.getSelectedItem().toString();
                Log.i("Selected item :", item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //ESCOGER SEGUN QUE QUIERAS PROBAR
        botonAceptar.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,DataBindingExample.class)));
        //botonAceptar.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,CardViewActivity.class)));

    }

    private void bindViews() {
        spinner=findViewById(R.id.mainActivity_spinner_declarativo);
        botonAceptar=findViewById(R.id.main_aceptar_btn);
    }

}