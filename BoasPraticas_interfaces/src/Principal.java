import com.nesrux.locadora.Locacao;
import com.nesrux.locadora.Notebook;
import com.nesrux.locadora.Precificacao;
import com.nesrux.locadora.PrecificacaoPorHora;

public class Principal {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Idea Pad ryzen 5 8gb ram", 5, 100);
        Precificacao precificacao = new PrecificacaoPorHora();

        Locacao locacao = new Locacao(notebook, precificacao);
        System.out.println(locacao.calcularValorDevido(10));

    }
}
