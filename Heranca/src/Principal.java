import com.nesrux.banco.Conta;
import com.nesrux.banco.Titular;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("João", "123456789"));
        conta1.depositar(1000);
        conta1.setAgencia(1234);
        conta1.setNumero(99955533);

        conta1.imprimirDemostrativo();
    }
}
