package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapaComValoresAgregados {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
        //*NOTA da JAUM : isso é basicamente um groupby fabricante com um sum de quantidade
        // de produtos só que escrito em java*/
        //
//        Map<String, Long> produtosPorFabricante = produtos.stream()
//                .filter(Produto::temEstoque)
//                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
//                        Collectors.counting()));
//
//
//        System.out.println(produtosPorFabricante);

        Map<String, Integer> produtosPorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(),
                        Collectors.summingInt(Produto::getQuantidade)));


        System.out.println(produtosPorFabricante);
    }
}
