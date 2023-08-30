import com.nesrux.banco.Conta;
import com.nesrux.banco.Titular;

public class Principal {
    public static void main(String[] args) {
        Titular titular = new Titular("João", "123456789");
        Conta conta = new Conta(titular, 123, 1545);
        conta.depositar(1000);
        conta.sacar(25.50);

        conta.imprimirDemonstrativo();

        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(27.50);
        conta.imprimirDemonstrativo();
    }
}
