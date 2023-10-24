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

        produtos.stream()
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
                .forEach(produto -> {
                    produto.ativar();
                    System.out.println(produto);
                });
    }
}
