package methodReference;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Principal1 {
    public static void main(String[] args) {
        /*sem method reference*/
        ToIntFunction<Produto> func1 = produto -> produto.getQuantidade();
        Consumer<Produto> consumer1 = produto -> produto.inativar();

        /*Com method reference, o method reference é transpilado para o modo sem
         * methodreference em tempo de compilação, ou seja no final das contas os dois
         * fazem a mesma coisa, e funcionam do mesmo jeito, porém utilizando o method reference
         * o código fica mais legivel*/
        ToIntFunction<Produto> func2 = Produto::getQuantidade;
        Consumer<Produto> consumer2 = Produto::inativar;
    }
}
