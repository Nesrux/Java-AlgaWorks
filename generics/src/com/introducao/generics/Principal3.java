package com.introducao.generics;

import com.introducao.generics.crm.Cliente;
import com.introducao.generics.crm.Funcionario;

public class Principal3 {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
                new Funcionario("cleiton", 45),
                new Funcionario("Thainá", 22),
                new Funcionario("marinalva", 39),
        };
        Cliente[] clientes = {
                new Cliente("posto limamei", 25_000),
                new Cliente("mecanica simas turbo", 35_000),
                new Cliente("two pay pal", 785_000)
        };
    }
}
