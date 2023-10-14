package classes_aninhadas_estaticas.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("João", 78));
        clientes.add(new Cliente("Maria", 53));
        clientes.add(new Cliente("Cleiton", 12));
        clientes.add(new Cliente("Getulio", 5));

        clientes.forEach(System.out::println);
    }
}
