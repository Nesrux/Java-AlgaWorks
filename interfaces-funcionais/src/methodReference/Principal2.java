package methodReference;

import com.elementosDeColecoes.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal2 {
    public static void main(String[] args) {
        var produtos = new ArrayList<com.elementosDeColecoes.Produto>();
        produtos.add(new com.elementosDeColecoes.Produto("Arroz", new BigDecimal("19.85"), 2));
        produtos.add(new com.elementosDeColecoes.Produto("Feijão", new BigDecimal("10"), 3));
        produtos.add(new com.elementosDeColecoes.Produto("Frango", new BigDecimal("15"), 2));
        produtos.add(new com.elementosDeColecoes.Produto("Adocante artificial", new BigDecimal("1.50"), 5, Produto.StatusProduto.INATIVO));
        produtos.add(new com.elementosDeColecoes.Produto("Leite condensado", new BigDecimal("25.75"), 0));
        produtos.add(new com.elementosDeColecoes.Produto("Chocolate de amendoas", new BigDecimal("4.75"), 14));
        produtos.add(new com.elementosDeColecoes.Produto("1l leite integrau", new BigDecimal("3.75"), 0));
        produtos.add(new com.elementosDeColecoes.Produto("Amaciante", new BigDecimal("8.75"), 10, Produto.StatusProduto.INATIVO));

        produtos.sort(Comparator.comparing(Produto::getQuantidade));
        produtos.forEach(System.out::println);

    }
}
