package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*Isso se chama pipeline, pipeline é uma sequencia de métodos utilizado
         * para criar ou modificar algo, nesse caso, filtrando as Streams*/
        Stream<Produto> stream = produtos
                .stream();
        /*Esse tipo de operção não esta filtrando de fato alguma coisa
         * isso se chama método lazy (preguiçoso)*/
        Stream<Produto> produtoStream = stream
                .filter(Produto::temEstoque);

        Stream<Produto> streamcomEstoqueIniativo = produtoStream.
                filter(Produto::isInativo);

        /*Para executar de fato as operações do pipelane, precisa utilizar
         * as operações terminais, ele executa todxs a pipeline*/

        streamcomEstoqueIniativo.forEach(produto -> {
            produto.ativar();
            System.out.println(produto);
        });

    }
}
