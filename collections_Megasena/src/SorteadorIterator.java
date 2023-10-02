import java.util.Iterator;

public class SorteadorIterator implements Iterator<Integer> {
    int[] numeros = {1, 2, 3};
    int posicaoAtual = 0;

    @Override
    public boolean hasNext() {
        return numeros.length < posicaoAtual;
    }

    @Override
    public Integer next() {
        return numeros[posicaoAtual];
    }
}
