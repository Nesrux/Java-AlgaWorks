import com.nesrux.banco.ContaEspecial;
import com.nesrux.banco.Titular;

public class principal4 {
    public static void main(String[] args) {
        Titular titular = new Titular("João", "123456789");
        ContaEspecial conta = new ContaEspecial(titular, 9, 999, 10);

        System.out.println(conta);
    }
}
