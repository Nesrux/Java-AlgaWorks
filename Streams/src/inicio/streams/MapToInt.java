package inicio.streams;

import inicio.streams.estoque.CadastroProduto;
import inicio.streams.estoque.Produto;

import java.util.List;

public class MapToInt {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
        /*MapToInt serve para trabalhar com o valaor primmitivo int, e todos os métodos subsequentes
         * também vão estar trabalhando com o int, para isso ele utiliza da interface intStream, existem
         * outras interfaces que fazem algo parecido, para acessar elas é só tilizar os respectivos maps
         * mapToDouble, float etc.*/
        /*E o sum faz justamente oque o nome dele diz, somas as coisas, é uma operação final */
        int teste = produtos.stream()
                .filter(Produto::temEstoque)
                .mapToInt(Produto::getQuantidade)
                .sum();
        System.out.println(teste);
    }
}
