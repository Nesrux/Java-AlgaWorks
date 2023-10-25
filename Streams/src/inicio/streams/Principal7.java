package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;

public class Principal7 {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*O método map funciona exatamente igual ao método map de
         * Optinal, ela faz muda o retorno do tipo da steam, nesse exemplo
         * o tipo produto possui um fabricante dentro dele, o map fez eu poder
         * acessar esse fabricante, transformando uma stream de produtos
         * em uma stream de fabricantes, ele nao altera os elementos da stream
         * só deixa eu acessalos para fazer quaisquer alterações*/

        /*distinct é um método intermediario que usa o método equals
         * ele faz que nem o distinct do SQL, ele retorna a stream com
         * distinção de tipo, ou objetos iguais nao podem acontecer.*/
        //Ela é uma operação statefull
        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct()
                .forEach(fabricante -> System.out.println(fabricante.nome()));
    }
}
