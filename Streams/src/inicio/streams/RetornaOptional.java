package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;

public class RetornaOptional {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(Integer::sum)
                .orElseThrow(RuntimeException::new);

        var a = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .sum();

        var b = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .average()
                .orElseThrow(RuntimeException::new);

        System.out.println(a);
        System.out.printf("%.2f", b);
    }


}
