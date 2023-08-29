import com.nesrux.banco.Conta;
import com.nesrux.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("João", "123456789"));
        conta1.depositar(100);
        conta1.setAgencia(1234);
        conta1.setNumero(99955533);
        conta1.setTipo(Conta.ESPECIAL);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaChequeEspecial(90);

        conta1.sacar(200);
        conta1.imprimirDemostrativo();
        conta1.debitarTatifaMensal();
    }
}
