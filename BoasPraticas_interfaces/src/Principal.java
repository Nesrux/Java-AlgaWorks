import com.nesrux.locadora.*;

public class Principal {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Idea Pad ryzen 5 8gb ram", 5, 100);
        Precificacao precificacao = new PrecificacaoPorDia();

        Locacao locacao = new Locacao(notebook, precificacao);
        System.out.println(locacao.calcularValorDevido(10));

    }
}
