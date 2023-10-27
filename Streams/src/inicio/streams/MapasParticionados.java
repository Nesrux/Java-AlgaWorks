package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapasParticionados {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<Boolean, List<Produto>> estoqueProdutos = produtos.stream()
                .collect(Collectors.partitioningBy(Produto::temEstoque));

        estoqueProdutos.forEach((k, v) -> {
            System.out.println();
            System.out.println(k);
            System.out.println("------");
            System.out.println(v);
        });
    }
}
