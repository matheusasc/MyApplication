package com.example.myapplication.model;

public class Produto {

    private long id;
    private String nome;
    private int qtdEmEstoque;
    private double preco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }

    public void setQtdEmEstoque(int qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(){

    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", qtdEmEstoque=" + qtdEmEstoque +
                ", preco=" + preco +
                '}';
    }
}
