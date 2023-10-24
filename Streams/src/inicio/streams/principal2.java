package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;

public class principal2 {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
        /*Esse código faz exatamente a nesna coisa que a classe Principal
         * só que de uma forma mais enchuta*/

        /*O método peek do ingles (olhadinha), é utilizado principalmente para fazer debug
         * porém, também pode ser utilizado para ou executar um método durante o a pipeline
         * a*/
        produtos.stream()
                .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
                .forEach(produto -> {
                    produto.ativar();
                    System.out.println(produto.getNome());
                });
    }
}
