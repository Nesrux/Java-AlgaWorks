import com.banco.*;

public class main3 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();


        Titular titular1 = new Titular("Marcelo Almeida", "123456");
        Titular titular2 = new Titular("Thiago Malaquias", "654321");
        Titular titular3 = new Titular("Gerundina almeida", "987654");

        ContaEspecial conta1 = new ContaEspecial(titular1, 999,99, 50);
        conta1.setLimiteChequeEspecial(500);



        ContaEspecial conta2 = new ContaEspecial(titular2, 568, 878, 100);

        ContaSalario conta3 = new ContaSalario(titular3, 456, 784, 2500);

        conta1.depositar(300);

        caixaEletronico.transferir(conta1, conta2, 400);

        conta1.imprimirDemonstrativo();
        conta3.imprimirDemonstrativo();
    }
}
