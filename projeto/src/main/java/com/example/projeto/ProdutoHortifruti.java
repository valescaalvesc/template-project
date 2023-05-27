package com.example.projeto;

public class ProdutoHortifruti extends Produto {

    public String verificarValor() {
        if (this.calcularValorMedio() >= 6.0f) {
            return "Reajuste";
        }
        else {
            return "Manteve valor";
        }
    }

    @Override
    public String getTipo() {
        return "ProdutoImportado";
    }
}
