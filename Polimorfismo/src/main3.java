import com.banco.CaixaEletronico;
import com.banco.Conta;
import com.banco.ContaEspecial;
import com.banco.Titular;

public class main3 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();


        Titular titular1 = new Titular("Marcelo Almeida", "123456");
        Titular titular2 = new Titular("Thiago Malaquias", "654321");

        ContaEspecial conta1 = new ContaEspecial(titular1, 999,99, 50);

        ContaEspecial conta2 = new ContaEspecial(titular1, 568, 878, 100);

        conta1.depositar(300);

        caixaEletronico.transferir(conta1, conta2, 50);

        conta1.imprimirDemonstrativo();
        conta2.imprimirDemonstrativo();
    }
}
