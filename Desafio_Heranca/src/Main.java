import desafio.domain.model.Funcionario;
import desafio.domain.model.Horelite;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Cleiton da silva", 13);

        funcionario.calcularSalario(300);

        Horelite horelite = funcionario.gerarOrelite(300, "janeiro/2010");
        System.out.println(horelite);
        System.out.println(funcionario);

    }
}