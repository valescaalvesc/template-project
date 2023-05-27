package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoMercadoTeste {

    @Test
    void deveRetonarReajuste() {
        ProdutoMercado produto = new ProdutoMercado();
        produto.setPreco1(7.0f);
        produto.setPreco2(7.0f);
        assertEquals("Reajuste", produto.verificarValor());
    }

    @Test
    void deveRetonarManteveValor() {
        ProdutoMercado produto = new ProdutoMercado();
        produto.setPreco1(2.0f);
        produto.setPreco2(1.5f);
        assertEquals("Manteve valor", produto.verificarValor());
    }

    @Test
    void deveRetornarInformacoes() {
        ProdutoMercado produto = new ProdutoMercado();
        produto.setPreco1(7.0f);
        produto.setPreco2(7.0f);
        produto.setNome("Fruta");
        produto.setCadastro(1812);
        assertEquals("Produto{cadastro=1812, nome='Fruta', valor=Reajuste}", produto.getInfo());
    }
}
