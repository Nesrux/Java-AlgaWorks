package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class CadastroHotel {
    private final LinkedList<Hotel> hoteis = new LinkedList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if (this.hoteis.contains(hotel)) {
            throw new HotelJaExisteException("Já existe este hotel na lista!");
        }

        //o método Add, do arrayList vem da interface Collections,
        hoteis.add(hotel);
    }

    public LinkedList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String nomeCidade) {
        ArrayList<Hotel> HoteisParaRemocao = new ArrayList<>();
        for (Hotel hotel : hoteis) {
            if (hotel.getCidade().equals(nomeCidade)) {
                HoteisParaRemocao.add(hotel);
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

    public void removerTodos() {
        this.hoteis.clear();
    }

}
