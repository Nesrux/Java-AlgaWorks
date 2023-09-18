package com.nesru.arraylist;

public class Principal {
    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Elma maria pinto", "Jacaré pagua", 200);
        cadastro.adicionar("Lima mei", "São paulo", 800);
        cadastro.adicionar("Lambimia hoteis", "Rio de fevereiro", 80);
        cadastro.adicionar("tchurusbango thurusbago", "Jacaré pagua", 20);
        cadastro.adicionar("thunfly hosteis", "Araçapuca ta terra", 20);


        //  System.out.println(cadastro.obterTodos());
        //Uma outra forma de fazer a mesma coisa
        //cadastro.obterTodos().forEach(System.out::println);

        Hotel hotel = (Hotel) cadastro.obterTodos().get(1);
        System.out.println(hotel);
    }
}
