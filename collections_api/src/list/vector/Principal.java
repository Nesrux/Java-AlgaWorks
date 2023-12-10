package list.vector;

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
        /*Anotações do Jaum !!*/
        /*A Implementação de List, Vector tem as Mesmas funcionalidades
         * de ArrayList, tanto em métodos quanto em processos, com a unica diferença
         * que Em vecto é uma classe que é feita para funcionar em paralelismo, ou seja
         * uma classe feita para funcionar em threads, ela da um Lock na classe durante
         * a execução de cada método, nao podendo ser executado um método até outro acabar
         *  em suma, ela nao deixa por exemplo vc iterar a classe adicionando e removendo
         * métodos ao mesmo tempo, ela é bem util para processos de negocio onde pode ocorrer
         * algum erro de eu tentar adicionar algo enquanto a lista esta sendo removida (Por exemplo)*/

    }

    private static void imprimirHoteis(Vector<Hotel> hoteis) {

        for (Hotel hotel : hoteis) {
            System.out.println(hotel.getNome());
        }

    }
}
