import java.util.Iterator;

public class Principal {
    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();

        Iterator<Integer> iteratorSort = sorteador.iterator();
        while (iteratorSort.hasNext()) {
            System.out.println(iteratorSort.next());
        }

    }
}
