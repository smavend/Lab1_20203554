package com.example.teleahorcado;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import com.example.teleahorcado.databinding.ActivityJuegoBinding;
import com.example.teleahorcado.databinding.ActivityMainBinding;

public class JuegoActivity extends AppCompatActivity {
    ActivityJuegoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityJuegoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String lista[] = {"BATI","PUCP","REDES","PROPA","TELITO","TELECO"};
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_juego, menu);
        return true;
    }

}