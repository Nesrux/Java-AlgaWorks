package Precisao.numeros;

import java.math.BigDecimal;

public class Principal2 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(BigDecimal.valueOf(1.0));

        conta.sacar(BigDecimal.valueOf(0.10));
        conta.sacar(BigDecimal.valueOf(0.20));
        conta.sacar(BigDecimal.valueOf(0.30));
        conta.sacar(BigDecimal.valueOf(0.40));

        System.out.println(conta.getSaldo());
    }
}
