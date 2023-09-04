package com.example.teleahorcado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.teleahorcado.databinding.ActivityMainBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        registerForContextMenu((TextView) findViewById(R.id.textView2));

        binding.button.setOnClickListener(view -> {

            Intent intent = new Intent(this, JuegoActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(@NotNull MenuItem item){
        TextView textView = findViewById(R.id.textView2);
        /*switch (item.getItemId()){
            case R.id.rojo:
                textView.setTextColor(Color.RED);
                return true;
            case R.id.verde:
                textView.setTextColor(Color.RED);
                return true;
            case R.id.azul:
                textView.setTextColor(Color.RED);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
         */
        if (item.getItemId()==R.id.rojo){
            textView.setTextColor(Color.RED);
            return true;
        }else if (item.getItemId()==R.id.verde){
            textView.setTextColor(Color.GREEN);
            return true;
        } else if (item.getItemId()==R.id.azul){
            textView.setTextColor(Color.BLUE);
            return true;
        }
        else {
            return super.onContextItemSelected(item);
        }
    }
}