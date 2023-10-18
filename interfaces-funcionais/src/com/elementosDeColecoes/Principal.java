package com.elementosDeColecoes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) {
        var produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Arroz", new BigDecimal("19.85"), 2));
        produtos.add(new Produto("Feijão", new BigDecimal("10"), 3));
        produtos.add(new Produto("Frango", new BigDecimal("15"), 2));
        produtos.add(new Produto("Adocante artificial", new BigDecimal("2.50"), 2));
        produtos.add(new Produto("Leite condensado", new BigDecimal("3.75"), 1));

        produtos.forEach(produto -> {produto.calcularPreco();});
    }
}
