package inicio.streams;

import java.util.Objects;
import java.util.stream.Stream;

public class MetodosClasseObjects {
    public static void main(String[] args) {
        /*A classe Objects do java Util, serve para ser utilizada
         * com a Stream api, ela é uma classe com vários métodos utilitarios
         * para verificação de objetos dentro de uma Streeam*/

        Stream.of("João", "Marcos", null, "Larissa")
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
