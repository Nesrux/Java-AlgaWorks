package list.arrayList;

import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Hoteis alma-solitude", "Jacaré pagua", 220);
        cadastro.adicionar("Xx_MELHOR-HOTEL_Xx", "São paulo", 160);
        cadastro.adicionar("Cesar palace", "Rio de fevereiro", 80);
        cadastro.adicionar("tchurus hoteis", "Jacaré pagua", 45);
        cadastro.adicionar("bango hoteis", "Araçapuca ta terra", 250);

        List<Hotel> hoteis = cadastro.obterTodos();
        System.out.println(hoteis);
        System.out.println("-----------------");
        cadastro.ordenarPorPreco();

        System.out.println(hoteis);
    }
}
