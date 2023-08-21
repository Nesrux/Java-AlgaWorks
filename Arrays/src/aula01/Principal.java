package aula01;

public class Principal {
    public static void main(String[] args) {
        //int o tipo [] declaração de array
        //new int a instancia,
        //[10] quantodade de elementos
       //int[] notas = new int[10];

       int [] notas = {8,7,94,5,6,5};
       //Acessando os elementos de um array
        System.out.println(notas[1]);

        //Mudando o valor de um elemento do array notas
        notas[2] = 7;

        //Posição que eu do array que eu quero acessar
       int posicao = 2;

       //print da possição do array
        System.out.println(notas[posicao]);
    }
}
