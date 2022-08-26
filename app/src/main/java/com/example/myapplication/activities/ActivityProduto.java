package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class ActivityProduto extends AppCompatActivity {

    private Button btnSalvarProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        btnSalvarProduto = findViewById(R.id.btnSalvarProduto);
        btnSalvarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityProduto.this, ActivityEnviado.class);
                startActivity(intent);
//                texto.setText("Clicou!");
            }
        });

//        Button botao = findViewById(R.id.btnSalvarProduto);
//        final TextView texto = findViewById(R.id.meuTexto);

//        botao.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                texto.setText("Clicou!");
    }
}