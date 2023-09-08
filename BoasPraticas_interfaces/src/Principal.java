import com.nesrux.locadora.*;

public class Principal {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Idea Pad ryzen 5 8gb ram", 5, 100);
        Precificacao precificacao = new PrecificacaoPorDia();
        Seguro seguro = new SeguroItau();

        Locacao locacao = new Locacao(notebook, precificacao, seguro);
        System.out.println(locacao.calcularValorDevido(10));

    }
}
