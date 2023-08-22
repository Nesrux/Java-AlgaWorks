package aula07;


import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        //Declarando um array
        int[] numerosJogo = {25, 48, 95, 17, 85, 66};
        //Copiando em uma nova variavel o array criado, só com 2 posições
        int[] numerosJogo2 = Arrays.copyOf(numerosJogo, numerosJogo.length + 2);

        System.out.println(Arrays.toString(numerosJogo));

        System.out.println(Arrays.toString(numerosJogo2));
    }
}
