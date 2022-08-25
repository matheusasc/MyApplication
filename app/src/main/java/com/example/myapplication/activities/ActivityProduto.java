package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class ActivityProduto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        Button botao = findViewById(R.id.btnSalvarProduto);
//        final TextView texto = findViewById(R.id.meuTexto);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                texto.setText("Clicou!");
            }
        });
    }
    }