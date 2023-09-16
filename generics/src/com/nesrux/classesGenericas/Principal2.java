package com.nesrux.classesGenericas;

import java.util.ArrayList;

public class Principal2 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10d);
        numeros.add(25d);
        numeros.add(15d);
        Double media = calcularMedia(numeros);

    }

    //Upper bounded wildcards:  ? extends number
    private static double calcularMedia(ArrayList<? extends Number> numeros) {
        double total = 0;

        for (Number numero : numeros) {
            total += numero.doubleValue();
        }

        return total / numeros.size();
    }
}
