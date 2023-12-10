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

        /*Java utiliza das implementações de HashCode para criar as HashTable, com o código hashGerado ele intancia
         * LinkedList para cada numero, dentro de um Array, aumentendo e muito a performance! (Estudar isso dps)*/

        /*Por boas praticas, as mesmas propriedades que se utiliza para gerar o Equals, também precisam ser
         * utilizada para gerar o código Hash, pois se nao poderia acontecer perca de dados dentro de Listas e
         * a diminuição da performance do código!*/
    }
}
