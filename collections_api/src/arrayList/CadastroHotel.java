package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroHotel {
    private final List<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if (this.hoteis.contains(hotel)) {
            throw new HotelJaExisteException("Já existe este hotel na lista!");
        }

        //o método Add, do arrayList vem da interface Collections,
        hoteis.add(hotel);
    }

    public List<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String nomeCidade) {
        ArrayList<Hotel> HoteisParaRemocao = new ArrayList<>();
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equals(nomeCidade)) {
                HoteisParaRemocao.add(hotel);
                //    hoteis.remove(i);
                //    i--;
            }

        }
        hoteis.removeAll(HoteisParaRemocao);
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);
        if (!removido) {
            throw new HotelNaoEncontradoException(String.format("O hotel de nome %s," +
                    " não esta nesta lista, e por isso nao foi removido", hotel.getNome()));
        }

    }

    public Hotel[] obterTodosComoArray() {
        return hoteis.toArray(new Hotel[0]);

        /*Notas do Jaum
         * O parametreo (A) do toArray, faz referencia ao tipo de array
         * que o método vai retornar, pois se o tamanho do array for menor que
         * o tamanho da lista, ele vai criar um array exatamente do tamanho da lista,
         * porém se o tamnho do arrray dor maior que a lista, ele faz preencher esse array
         * com intencias nulas da mesma classe!*/

        //       Hotel[] hoteis2 = new Hotel[hoteis.size()];
//        for (int i = 0; i < hoteis.size(); i++) {
//            hoteis2[i] = hoteis.get(i);
//        }
//        return hoteis2;
    }

    public void removerTodos() {
        this.hoteis.clear();
    }

    public void ordenar() {
        Collections.sort(hoteis);
    }

    public void ordenarPorPreco() {
        hoteis.sort(new Hotel.PrecoHotelComparator());
    }

}
