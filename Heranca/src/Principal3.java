import com.nesrux.banco.ContaEspecial;
import com.nesrux.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial();
        conta1.setTitular(new Titular("João", "123456789"));
        conta1.setAgencia(1234);
        conta1.setNumero(99955533);
        conta1.setTarifaChequeEspecial(90);
        conta1.setLimiteChequeEspecial(99999);

        conta1.imprimirDemostrativo();

//        conta1.depositar(100);
//        conta1.imprimirDemostrativo();
//
//        conta1.sacar(200);
//        conta1.imprimirDemostrativo();
//
//        conta1.debitarTatifaMensal();
//        conta1.imprimirDemostrativo();
    }
}
