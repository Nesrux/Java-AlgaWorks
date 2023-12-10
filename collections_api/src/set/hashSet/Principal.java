package set.hashSet;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("joao", "joao@gmail.com", 21));
        contatos.add(new Contato("maria", "maria@gmail.com", 45));
        contatos.add(new Contato("jose", "josé@gmail.com", 23));
        contatos.add(new Contato("anastasia", "anastasia@gmail.com", 33));

        contatos.forEach(c -> System.out.println(c.hashCode()));
    }
}
