package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Categoria;
import inicio.streams.estoque.Produto;

import java.util.ArrayList;
import java.util.List;

public class Colect {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*Essa sobrecarga de .collect que recebe 3 parametos são
         * o primeiro parametro a intancia que esse colect vai retornar,
         * 1) que nesse casp é do tipo arrayList
         * 2) o segundo parametro é o método de adição, a colection, nesse caso .add
         * 3) esse serve para utilizar o paralelStream, ele (pode) cria 2 listas
         * separadas, e depois e cumulam na outra, isso funciona pq esta utilizando
         * o paradigma programação paralelo */
        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                .collect(() -> new ArrayList<>(),
                        (lista, item) -> lista.add(item),
                        (lista1, lista2) -> lista1.addAll(lista2));
    }

}
