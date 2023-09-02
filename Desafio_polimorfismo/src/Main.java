import desafioPolimorfismo.domain.GestorImpostos;
import desafioPolimorfismo.domain.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        var gestorImpostos = new GestorImpostos();

        PessoaFisica joao = new PessoaFisica("João", 45_000);
        PessoaFisica maria = new PessoaFisica("Maria", 180_000);

        gestorImpostos.adicionar(joao, maria);
        System.out.printf("Total de impostos %.2f", gestorImpostos.getValorTotalImpostos());
    }
}