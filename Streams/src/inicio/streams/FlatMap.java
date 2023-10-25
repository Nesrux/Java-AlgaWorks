package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
        /*FlatMap funciona exatamente igual ao do optinal, mas ao invés ser um
         * Optional<Optional<T>> é um Stream<Stream<T>>
         * ele serve para como no exemplo, uma liste de objetos e dentro desse
         * objetos existem alguma collection que precise virar um stream
         * nesse caso,  um arrayList de produto, em cada produto tem um
         * Set de gategorias*/

        produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .forEach(System.out::println);
    }
}
