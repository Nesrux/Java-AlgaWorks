package bigDecimal.divisao;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {
    public static void main(String[] args) {
        var x = new BigDecimal("10.0");
        var y = new BigDecimal("3.0");

        //BigDecimal z  = x.divide(y, 4, RoundingMode.UP);
        //BigDecimal z  = x.divide(y, 4, RoundingMode.DOWN);

        BigDecimal z = x.divide(y, 4, RoundingMode.HALF_EVEN);
        //Scale (segundo argumento do método)
        //serve para definir quantas casas decimais o resultado deve ter, é que nem o .2f

        //E o roundingMode é o tipo de arredondamento que o Bigdecimal vai usar

        /*HALF_EVEN é bastante utilizando em sistemas bancarios, pois ele arredonda de uma forma em que,
         * estatisticamente é menos provavel de acontecer erros acumulativos de divisão em contas bancarias*/
        //Ele arredonda assim,
        // 2.343 === 2.34
        // 2.346 == 2.35


        System.out.println(z);


    }
}
