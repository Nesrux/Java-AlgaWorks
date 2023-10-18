package com.elementosDeColecoes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Principal {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Arroz", new BigDecimal("19.85"), 2));
        produtos.add(new Produto("Feijão", new BigDecimal("10"), 3));
        produtos.add(new Produto("Frango", new BigDecimal("15"), 2));
        produtos.add(new Produto("Adocante artificial", new BigDecimal("2.50"), 5,
                Produto.StatusProduto.INATIVO));
        produtos.add(new Produto("Leite condensado", new BigDecimal("3.75"), 0));
        produtos.add(new Produto("Chocolate de amendoas", new BigDecimal("3.75"), 14));
        produtos.add(new Produto("1l leite integrau", new BigDecimal("3.75"), 0));
        produtos.add(new Produto("Amaciante", new BigDecimal("8.75"), 10,
                Produto.StatusProduto.INATIVO));

        Predicate<Produto> qtdaMenorQueZero = produto -> produto.getQuantidade() < 0;
        Predicate<Produto> isInativo = produto -> Produto.StatusProduto.INATIVO.equals(produto.getStatus());

        produtos.removeIf(qtdaMenorQueZero.or(isInativo));


        for (Produto produto : produtos) {
            System.out.println(produto);
        }

    }
}
