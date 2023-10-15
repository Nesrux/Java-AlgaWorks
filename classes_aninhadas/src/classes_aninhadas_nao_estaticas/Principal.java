package classes_aninhadas_nao_estaticas;

import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(new BigDecimal("1000"));

        System.out.println(conta.getSaldo());
        //para instanciar uma classe nao estatica, precisa da variavel que referencia a classe superior
        //nesse caso conta é do tipó ContaCorrente que por sua vez é da classe de mesmo nome.
        //para conseguir o contrutor de Transasao, precisa referenciar a variavel conta
        ContaCorrente.Transacao transacao1 = conta.new Transacao("Compra de frango",
                new BigDecimal("150.57"));
        ContaCorrente.Transacao transacao2 = conta.new Transacao("Compra de batata doce",
                new BigDecimal("150.57"));

        System.out.println(conta.getSaldo());

        for (ContaCorrente.Transacao transacao : conta.getTransacoes()) {
            System.out.printf("%s = %s%n", transacao.getDescricao(), transacao.getValor());
        }
    }
}
