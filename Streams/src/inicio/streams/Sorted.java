package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.Comparator;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*o método .sorted(), server para fazer ordenação de uma lista, o método
         * sem argumentos utilzia a interface implementada de Comparable, mas caso
         * não tenha, nao quiser colocar, pode usar os métodos estaticos da classe
         * Comparator como no exemplo.*/
        produtos.stream()
                .filter(Produto::temEstoque)
                .sorted(Comparator.comparingInt(Produto::getQuantidade))
                .forEach(produto -> System.out.printf("%s = %d unidade%n",
                        produto.getNome(), produto.getQuantidade()));
    }
}
