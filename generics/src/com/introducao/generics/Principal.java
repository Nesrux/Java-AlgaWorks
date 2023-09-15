package com.introducao.generics;

import com.introducao.generics.crm.Cliente;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList clientest = new ArrayList();

        clientest.add(new Cliente("joao", 1800));
        clientest.add(new Cliente("Maria", 2500));

        double totalFaturamento = 0d;
        for (Object objeto : clientest) {
            Cliente cliente = (Cliente) objeto;
            totalFaturamento += cliente.getFaturamentoMensal();

        }
        System.out.println(totalFaturamento);
    }
}
