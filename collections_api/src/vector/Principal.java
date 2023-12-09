package vector;

import java.util.Vector;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Hoteis alma-solitude", "Jacaré pagua", 200);
        cadastro.adicionar("Xx_MELHOR-HOTEL_Xx", "São paulo", 800);
        cadastro.adicionar("Cesar palace", "Rio de fevereiro", 80);
        cadastro.adicionar("tchurus hoteis", "Jacaré pagua", 20);
        cadastro.adicionar("bango hoteis", "Araçapuca ta terra", 20);

        Vector<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(cadastro.obterTodos());


    }

    private static void imprimirHoteis(Vector<Hotel> hoteis) {

        for (Hotel hotel : hoteis) {
            System.out.println(hotel.getNome());
        }

    }
}
