package com.tokioschol.listasdesplegables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tokioschol.listasdesplegables.databinding.ActivityDataBindingExampleBinding;
import com.tokioschol.listasdesplegables.domain.User;

public class DataBindingExample extends AppCompatActivity {

    private ActivityDataBindingExampleBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding= ActivityDataBindingExampleBinding.inflate(getLayoutInflater());
        setContentView(dataBinding.getRoot());
        // generamos codigo llamamos a un sevicio y obtenemos el usuario
        User user= new User("Pedro","Perez",16);

        dataBinding.setUser(user);
    }
}