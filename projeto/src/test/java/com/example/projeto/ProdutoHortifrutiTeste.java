package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoHortifrutiTeste {

    @Test
    void deveRetonarReajuste() {
        ProdutoHortifruti produto = new ProdutoHortifruti();
        produto.setPreco1(6.0f);
        produto.setPreco2(10.0f);
        assertEquals("Reajuste", produto.verificarValor());
    }

    @Test
    void deveRetonarManteveValor() {
        ProdutoHortifruti produto = new ProdutoHortifruti();
        produto.setPreco1(3.0f);
        produto.setPreco2(3.0f);
        assertEquals("Manteve valor", produto.verificarValor());
    }

    @Test
    void deveRetornarInformacoes() {
        ProdutoHortifruti produto = new ProdutoHortifruti();
        produto.setPreco1(3.0f);
        produto.setPreco2(3.0f);
        produto.setNome("Fruta");
        produto.setCadastro(1010);
        assertEquals("ProdutoImportado{cadastro=1010, nome='Fruta', valor=Manteve valor}", produto.getInfo());
    }
}
