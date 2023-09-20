package com.nesru.arraylist;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Elma maria pinto", "Jacaré pagua", 200);
        cadastro.adicionar("Lima mei", "São paulo", 800);
        cadastro.adicionar("Lambimia hoteis", "Rio de fevereiro", 80);
        cadastro.adicionar("tchurusbango thurusbago", "Jacaré pagua", 20);
        cadastro.adicionar("thunfly hosteis", "Araçapuca ta terra", 20);

        // System.out.println(cadastro.obterTodos());
        //Uma outra forma de fazer a mesma coisa
        // cadastro.obterTodos().forEach(System.out::println);
        //  Hotel = (Hotel) cadastro.obterTodos().get(1);//System.out.println(hotel);
        //imprimirHoteis(hoteis);


        ArrayList<Hotel> hoteis = cadastro.obterTodos();

        //Caso não exista um hotel com esse indice, ele vai retornar -1
        int indice = hoteis.indexOf(new Hotel("Lambimia hoteis", "Rio de fevereiro", 80));
        System.out.println(indice);

        //O método set remove o objeto que esta no indice declarado
        //e depois adiciona o novo objeto do segundo argumento
        hoteis.set(0, new Hotel("TESTE", "TESTE", 5));

        /*o método add por sua vez faz algo parecido, ele adiciona objeto no indice delcarado
         * mas nao subistitui, ele avança o objeto que ja estava na lista uma casa para frente
         * se essa estiver sendo utilizada, ele avança todos os objetos sequentets*/
        hoteis.add(3, new Hotel("TESTE2", "TESTE2", 0));

        cadastro.removerPorCidade("Jacaré pagua");

        imprimirHoteis(cadastro.obterTodos());
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}
