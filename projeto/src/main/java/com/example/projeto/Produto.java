package com.example.projeto;

public abstract class Produto {

    private int cadastro;
    protected String nome;
    private float preco1;
    private float preco2;

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco1() {
        return preco1;
    }

    public void setPreco1(float preco1) {this.preco1 = preco1;}

    public float getPreco2() {
        return preco2;
    }

    public void setPreco2(float preco2) {this.preco2 = preco2;}

    public float calcularValorMedio() {return (this.preco1 + this.preco2)/2;}

    public abstract String verificarValor();

    public String getTipo() {
        return "Produto";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "cadastro=" + this.cadastro +
                ", nome='" + this.nome + '\'' +
                ", valor=" + this.verificarValor() +
                '}';
    }
}
