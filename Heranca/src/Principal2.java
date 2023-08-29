import com.nesrux.banco.Conta;
import com.nesrux.banco.ContaInvestimento;
import com.nesrux.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento();
        conta1.setTitular(new Titular("João", "123456789"));
        conta1.depositar(1000);
        conta1.setAgencia(1234);
        conta1.setNumero(99955533);

        conta1.sacar(25.50);
        conta1.creditarRendimentos(10);
        conta1.imprimirDemostrativo();
    }
}
