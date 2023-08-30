import desafio.domain.model.Funcionario;
import desafio.domain.model.Horelite;
import desafio.domain.model.Programador;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Cleiton da silva", 50);
        Horelite horelite1 = funcionario.gerarOrelite(10, "janeiro/2010");
        horelite1.imprimir();

        Programador programador = new Programador("João marcos", 50, 250);
        Horelite horelite2 = programador.gerarOrelite(10, "janeiro/2020");
        horelite2.imprimir();
    }
}