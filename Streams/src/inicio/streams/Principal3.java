package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;

public class Principal3 {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
        /*findfrist como o nome ja diz, é um método terminal que retorna o primeiro
         * obj que ele achar*/
        var produto = produtos.stream()
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
