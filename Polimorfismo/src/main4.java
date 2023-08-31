import com.banco.CaixaEletronico;
import com.banco.ContaEspecial;
import com.banco.ContaInvestimento;
import com.banco.Titular;

public class main4 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("Joséfino pinto", "123456"), 123, 123456789, 10);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Joséfa vagina", "654321"), 123, 7854496);
        conta2.depositar(100);

        caixaEletronico.imprimirDemostrativo(conta1);
    }
}
