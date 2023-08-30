import com.nesrux.banco.ContaEspecial;
import com.nesrux.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        System.out.println();
        Titular titular = new Titular("João", "123456789");
        ContaEspecial conta = new ContaEspecial(titular, 9, 999, 10);
      
        conta.setTarifaChequeEspecial(90);
        conta.setLimiteChequeEspecial(1000);

        conta.imprimirDemostrativo();

        conta.depositar(100);
        conta.imprimirDemostrativo();

        conta.sacar(200);
        conta.imprimirDemostrativo();

        conta.debitarTatifaMensal();
        conta.imprimirDemostrativo();
    }
}
