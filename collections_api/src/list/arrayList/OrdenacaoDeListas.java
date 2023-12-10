package list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoDeListas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(55);
        numeros.add(12);
        numeros.add(982);
        numeros.add(25);
        numeros.add(1);
        numeros.add(5);
        //       numeros.sort( Integer::compareTo);
        // Collections.sort(numeros);
        Collections.sort(numeros, Comparator.reverseOrder());
        List<String> letras = new ArrayList<>();

        letras.add("a");
        letras.add("z");
        letras.add("w");
        letras.add("t");
        letras.add("h");
        letras.sort(String::compareTo);

        System.out.println(numeros);
        System.out.println(letras);
    }
}
