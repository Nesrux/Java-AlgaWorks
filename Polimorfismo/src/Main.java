import com.banco.Conta;
import com.banco.ContaEspecial;
import com.banco.Titular;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("João", "123456");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 123456, 888, 10);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(100);

        //Isso é um {upCasting}, estamos enxergando ele como se fosse um objeto
        //do tipo conta, mas ele ainda é um tipo contaEspecial
        //Também serve utilizando o cast (obj), ele vai ser feito implicitamente

        Conta conta = contaEspecial;


    }
}