import com.nesrux.locadora.LocacaoPorDia;
import com.nesrux.locadora.LocacaoPorHora;
import com.nesrux.locadora.Notebook;

public class Principal {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Idea Pad ryzen 5 8gb ram", 5, 100);

        LocacaoPorDia dia = new LocacaoPorDia(notebook);
        var locacaoDia = dia.calcularValorDevido(10);

        LocacaoPorHora hora = new LocacaoPorHora(notebook);
        var locacaoHora = hora.calcularValorDevido(10);


        System.out.println("O valor a pagar é (dias) : " + locacaoDia);
        System.out.println("O valor a pagar é (horas) : " + locacaoHora);
    }
}
