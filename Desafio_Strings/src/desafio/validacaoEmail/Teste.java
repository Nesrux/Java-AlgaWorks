package desafio.validacaoEmail;

import java.util.regex.Pattern;

public class Teste {
    public static void main(String[] args) {
        String email = "cleiton@moacir.com";
        boolean valido = Pattern.matches("[\\w.-]+@[a-z]+\\.\\w{2,3}", email);
        System.out.println(valido);

        //  ValidadorEmail.validar("cleiton@mo$acir.com");

    }
}
