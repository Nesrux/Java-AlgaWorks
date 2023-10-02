import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {
    private static final Random random = new Random();
    private int quantidadeSorteada;


    @Override
    public boolean hasNext() {
        return quantidadeSorteada < 6;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Todos os elementos ja foram sorteados");
        }

        this.quantidadeSorteada++;
        return random.nextInt(60);
    }
}
