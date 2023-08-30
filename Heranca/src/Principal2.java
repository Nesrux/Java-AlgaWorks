import com.nesrux.banco.ContaInvestimento;
import com.nesrux.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {
        Titular titular = new Titular("João", "123456789");
        ContaInvestimento conta = new ContaInvestimento(titular, 1213, 565);
        conta.depositar(1000);

        conta.sacar(25.50);
        conta.creditarRendimentos(10);
        conta.imprimirDemostrativo();
    }
}
