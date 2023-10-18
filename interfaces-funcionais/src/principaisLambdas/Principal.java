package principaisLambdas;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal {
    public static void main(String[] args) {
        /*As 4 principais interfaces funcionais do java*/


        /*Predicate é uma interface funcional que sempre irá retornar um boolean
         * ele serve pincipalmente para fazer validações! */
        Predicate<Long> validNumber = number -> number > 50;
        System.out.println(validNumber.test(5L));

        /*Consumer por sua vez recebe um tipo e tem o retorno de void, ou seja, ele é utilizado para modificar objetos
         * (na maioria das vezes) e que nao precise de retorno no método, como nesse caso, o setIdade(); */
        Consumer<Teste> aumentarIdade = user -> user.setIdade(user.getIdade() + 1);

        Teste teste = new Teste();
        teste.setNome("Cleiton");
        teste.setIdade(15);
        teste.setEmail("PedrinhoMatadorDePorco@gmail.com");
        System.out.println(teste);

        aumentarIdade.accept(teste);
        System.out.println(teste);

        /*Function é a interface funcional que recebe um argumento e retorna outro argumento
         * nesse caso ele recebe um obj do tipo Teste e retorna um a String*/
        Function<Teste, String> testeStringFunction = str -> str.getEmail() + "Sua senha é " +
                str.getIdade() + "ASCS4578";

        System.out.println(testeStringFunction.apply(teste));

        /*Supplier é uma interface funcional que nao recebe argumentos e retorna algo, ou seja ela vai apenas executar
         * um método ja existente*/
        Supplier<LocalDateTime> dataHoraAgr = () -> LocalDateTime.now();
        System.out.println(dataHoraAgr.get());
    }
}
