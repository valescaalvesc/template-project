package com.example.projeto;

public class ProdutoMercado extends Produto{

    public String verificarValor() {
        if (this.calcularValorMedio() >= 4.0f) {
            return "Reajuste";
        }
        else {
            return "Manteve valor";
        }
    }
}
