package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.math.BigDecimal;
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

        var reduceBigdecimal = produtos.stream()
                .map(produto -> produto.getPreco()
                        .multiply(new BigDecimal(produto.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        /*Outra forma de fazer exatemente a mesma
        coisa mas em cenários difetentes, dessa forma, é bom utilziar o paralel stream*/

        var valorEstoque = produtos.stream()
                .reduce(BigDecimal.ZERO, (sub, prod) -> {
                    return sub.add(prod.getPreco()
                            .multiply(new BigDecimal(prod.getQuantidade())));
                }, BigDecimal::add);


        System.out.println(reduceBigdecimal);
        System.out.println(valorEstoque);
    }
}
