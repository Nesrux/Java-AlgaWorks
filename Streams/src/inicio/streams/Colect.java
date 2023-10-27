package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Categoria;
import inicio.streams.estoque.Produto;

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
                .toList();
//       .collect(Collectors.toList());
//        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        /*O collectors.toList
         * A classe Collectots, possuem alguns métodos estaticos que fazem a mesma coisa
         * que o que o ultimo método comentendo, só que para todas as coleçoes do java
         * ela é uma classe utilitaria, de extrema importancia*/

        /*o método toList do stream, também gera um arrayList, porém ela gera
         * uma lista que nao pode ser modificada*/
    }

}
