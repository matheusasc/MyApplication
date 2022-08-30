package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MeuViewHolder extends RecyclerView.ViewHolder {

    ImageView imagem;
    TextView titulo;
    TextView data_exib;


    public MeuViewHolder(View itemView) {
        super(itemView);
        imagem = itemView.findViewById(R.id.imageView);
        titulo = itemView.findViewById(R.id.textView2);
        data_exib = itemView.findViewById(R.id.textView3);

    }

}
