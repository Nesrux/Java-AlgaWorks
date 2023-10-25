package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.Comparator;
import java.util.List;

public class Operacoes_Statefull {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*sorted é uma operação intermediria de estado (statefull)
         * mesmo que o anymatch seja uma operção de curto-circuito
         * o sorted vai fazer ele iterar toda a lista indifentemente
         * se o anymatch bater true no primeiro oobjeto, isso pode
         * atrapalhar a performance se tiver muitos dados nessa stream*/
        boolean temProdutoComEstoque = produtos.stream()
                .peek(System.out::println)
                .sorted(Comparator.comparingInt(Produto::getQuantidade))
                .anyMatch(Produto::temEstoque);

        System.out.println(temProdutoComEstoque);
    }
}
