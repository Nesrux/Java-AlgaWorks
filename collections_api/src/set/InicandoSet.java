package set;

import java.util.HashSet;
import java.util.Set;

public class InicandoSet {
    public static void main(String[] args) {
        /*HashSet é uma implementação de Set que por baixo dos panos
         * utiliza HashTable, ela não garante a ordenação la Lista e
         * nao permite duplicatas de objetos, ESpecificamente hashSet é a mais
         * performatica das implementações de Set e por isso é  a mais Utilizada!*/

        Set<Integer> numeros = new HashSet<>();
        numeros.add(4);
        numeros.add(9);
        numeros.add(12);
        numeros.add(597);
        numeros.add(93);
        numeros.add(33);
        numeros.add(null);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
