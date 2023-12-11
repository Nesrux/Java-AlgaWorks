package set.hashSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
    public static void main(String[] args) {
        Set<Contato> contatos = new LinkedHashSet<>();

        contatos.add(new Contato("joao", "joao@gmail.com", 21));
        contatos.add(new Contato("maria", "maria@gmail.com", 45));
        contatos.add(new Contato("jose", "josé@gmail.com", 23));
        contatos.add(new Contato("anastasia", "anastasia@gmail.com", 33));
        contatos.add(new Contato("saxsa", "saxsa@gmail.com", 21));
        contatos.add(new Contato("astrid", "asdrid@gmail.com", 33));
        contatos.add(new Contato("sergio", "sergio@gmail.com", 33));
        contatos.add(new Contato("Marcela", "marcela@gmail.com", 33));

        System.out.println(contatos.size());
        for(Contato contato: contatos){
            System.out.println(contato);
        }

        /*Java utiliza das implementações de HashCode para criar as HashTable, com o código hashGerado ele intancia
         * LinkedList para cada numero, dentro de um Array, aumentendo e muito a performance! (Estudar isso dps)*/

        /*Por boas praticas, as mesmas propriedades que se utiliza para gerar o Equals, também precisam ser
         * utilizada para gerar o código Hash, pois se nao poderia acontecer perca de dados dentro de Listas e
         * a diminuição da performance do código!*/
    }
}
