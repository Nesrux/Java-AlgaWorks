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
        cadastro.adicionar("thunfly hosteis", "Araçapuca ta terra", 20);

        // System.out.println(cadastro.obterTodos());
        //Uma outra forma de fazer a mesma coisa
        // cadastro.obterTodos().forEach(System.out::println);

        //  Hotel = (Hotel) cadastro.obterTodos().get(1);//System.out.println(hotel);

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
}
