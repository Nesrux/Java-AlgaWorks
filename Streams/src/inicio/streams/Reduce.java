package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*Operações de redução, são operaçoes que retornam um unico valor
         * ao invés de retornar uma collection de algo, ela retorna um unico valor
         * seja um objeto ou um tipo primitivo, existem varios métodos que fazem isso
         * um deles é um reduce*/


        var a = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(Integer::sum);
        System.out.println(a);
    }
}
