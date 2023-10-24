package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;

public class Principal4 {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*AnyMatch é um método terminal que retorna booleno, ele serve para fazer uma verificação
         * e validação do stream antes de executar de fato alguma operção
         * o anymach verifica se algum elemento dessa collection esta bas condições validas dentro do predicate */
        boolean temProdutoNoEstoque = produtos.stream()
                .peek(System.out::println)
                .anyMatch(Produto::temEstoque);

        /*o Allmatch tem a mesma ideia, só que a diferença é que ele verifica se todos dentro daquela coleção
         * estão validos*/
        boolean todosProdutosTemEstoque = produtos.stream()
                .allMatch(Produto::temEstoque);
        /*e o noneMatch é a mesma coisa que o allmach só que negado, ou seja se nenhum obj dentro daquela collection
         * "bate com o predicate"*/
        boolean nenhumProdutoTemEstoque = produtos.stream()
                .noneMatch(Produto::temEstoque);


    }
}
