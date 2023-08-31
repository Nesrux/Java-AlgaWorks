import com.banco.Conta;
import com.banco.ContaSalario;
import com.banco.Titular;

public class main2 {
    public static void main(String[] args) {
        Titular titular = new Titular("Jaime", "123456");
        Conta conta = new ContaSalario(titular, 456,564, 18000);



    }
}
