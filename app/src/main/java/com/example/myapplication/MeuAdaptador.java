package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MeuAdaptador extends RecyclerView.Adapter {

    ArrayList<Episodio>episodios;
    Context context;

    public MeuAdaptador(ArrayList<Episodio> episodios, Context context) {
        this.episodios = episodios;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.minha_celula,parent,false);
        MeuViewHolder meuViewHolder = new MeuViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        MeuViewHolder meuViewHolder = (MeuViewHolder) holder;
        Episodio meuEpisodio = episodios.get(position);
        meuViewHolder.titulo.setText(meuEpisodio.getTitulo());
        meuViewHolder.data_exib.setText(meuEpisodio.getData_exib());
        meuViewHolder.imagem.setImageResource(R.drawable.dlf_pt_panic_png_5920527);
    }

    @Override
    public int getItemCount() {
        return episodios.size();
    }
}
