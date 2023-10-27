package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Fabricante;
import inicio.streams.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ColectMap {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<String, Integer> estoque = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.toMap(Produto::getNome, Produto::getQuantidade));
        System.out.println(estoque);

        Map<Fabricante, List<Produto>> produtosFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(Produto::getFabricante));
        produtosFabricante.forEach((fabricante, lista) ->{
            System.out.println();
            System.out.println(fabricante.nome());
            System.out.println("--------");
            lista.forEach(produto -> System.out.println(produto.getNome()));
        });
    }
}
