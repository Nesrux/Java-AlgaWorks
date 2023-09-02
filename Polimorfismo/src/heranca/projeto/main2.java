package heranca.projeto;

import heranca.projeto.banco.Conta;
import heranca.projeto.banco.ContaSalario;
import heranca.projeto.banco.Titular;

public class main2 {
    public static void main(String[] args) {
        Titular titular = new Titular("Jaime", "123456");
        //Nesse caso, como ContaSalario herda diretamente de Conta e nao de seu subtipos, como Conta
        // * Especial e conta investimento, nao pode ser feito o cast direto para ambos os casos,
        // * somente para o super tipo CONTA
        Conta conta = new ContaSalario(titular, 456,564, 18000);



    }
}
