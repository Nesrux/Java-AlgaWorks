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
        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .forEach(fabricante -> System.out.println(fabricante.nome()));
    }
}
