package aula08;

import java.util.Arrays;

public class principal {
    public static void main(String[] args) {
        int[] numeroJogoAtual = {28, 78, 65, 77, 12, 33, 62};
        int[] numeroNovojogo = new int[numeroJogoAtual.length - 1];
        //Define o indice de exclusão
        var indiceExclusao = 2;
        //Copia a primeira parte do array (até o 78)
        System.arraycopy(numeroJogoAtual, 0, numeroNovojogo, 0, indiceExclusao);
        //Copia a segunda parte do array,(pula 0 65)
        System.arraycopy(numeroJogoAtual, indiceExclusao + 1, numeroNovojogo, indiceExclusao, 4);


        System.out.println(Arrays.toString(numeroJogoAtual));

        System.out.println(Arrays.toString(numeroNovojogo));
    }
}
