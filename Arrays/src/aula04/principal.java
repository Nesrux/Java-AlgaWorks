package aula04;

import java.util.Arrays;
import java.util.Comparator;

public class principal {
    public static void main(String[] args) {
        Integer[] notas = {1, 8, 7, 6, 4, 7, 2, 4, 6};

        Arrays.sort(notas);
        //Comparator é umc classe para fazer comparação de objetos, é uma classe utilitária
        Arrays.sort(notas, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notas));
    }
}
