package linkedList;

import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Hoteis alma-solitude", "Jacaré pagua", 200);
        cadastro.adicionar("Xx_MELHOR-HOTEL_Xx", "São paulo", 800);
        cadastro.adicionar("Cesar palace", "Rio de fevereiro", 80);
        cadastro.adicionar("tchurus hoteis", "Jacaré pagua", 20);
        cadastro.adicionar("bango hoteis", "Araçapuca ta terra", 20);

        LinkedList<Hotel> hoteis = cadastro.obterTodos();
        hoteis.addLast(new Hotel("elma maria hotel", "chabrinquei", 24));
        hoteis.addLast(new Hotel("elma maria hostel", "chabrinquei", 24));

        imprimirHoteis(cadastro.obterTodos());

        /*Anotações do Jaaum*/
        /*LinkedList, que no caso do Java, é um Double Linked List do inglês,
        * lista duplamente ligada, é uma implementação da interface List, que visa
        * performance, da remoção e asserção de valores dentro da lista, ela nao utiliza
        * internamente arrays, ela utilza de indices para fazer a iteração da lista, então
        * se a linkedList for muito grande vai ter graves problemas de performance, pois
        * sempre sera preciso iterar toda a lista para achar um valor esspecifico, porém
        * na Hora de adicionar ou remover objetos é muito mais performaticos, pois como não
        * utiliza de arrays, não precisa ficar dupplicando todx para aumentar o tamnho,
        * ganhando muita performance do processo*/
    }

    private static void imprimirHoteis(LinkedList<Hotel> hoteis) {

        for (Hotel hotel : hoteis) {
            System.out.println(hotel.getNome());
        }

    }
}
