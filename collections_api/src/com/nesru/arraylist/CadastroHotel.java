package com.nesru.arraylist;

import java.util.ArrayList;

public class CadastroHotel {
    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if (this.hoteis.contains(hotel)) {
            throw new HotelJaExisteException("Já existe este hotel na lista!");
        }

        //o método Add, do arrayList vem da interface Collections,
        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String nomeCidade) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equals(nomeCidade)) {
                hoteis.remove(i);
            }
        }
    }

}
