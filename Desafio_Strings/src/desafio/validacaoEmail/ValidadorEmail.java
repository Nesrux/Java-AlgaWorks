package desafio.validacaoEmail;

public class ValidadorEmail {
    //nomedouser@domino.sufixodo dominio
    /* 1) nome do usuario nao pode ser vazio e é alphanumérico mas não aceita caracteres especiais
     * apenas _ (underline), . (pontos), e - (hifén),
     *
     * 2) o dominio tem que ser em minusculo e nao pode aceitar caracteres especiais
     *
     * 3.)e sufixo só pode ter no maximo 3 letras sem caracteres especiais*/

    public static boolean validar(String email) {
        String nomeUser = email.substring(0, email.indexOf("@"));
        String dominio = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        String sufixo = email.substring(email.lastIndexOf(".") + 1);
        System.out.println(sufixo);
        return validarSufixo(sufixo) && validarDominio(dominio) && validarNomeUsuario(nomeUser);
    }

    private static boolean validarNomeUsuario(String nomeUser) {
        if (nomeUser.isEmpty() || nomeUser.isBlank()) {
            return false;
        }
        char[] nomeUserArray = nomeUser.toCharArray();
        for (char c : nomeUserArray) {
            if (!isAlfaNumerico(c)) {
                return false;
            }
        }


        return true;
    }

    private static boolean validarDominio(String dominio) {
        char[] caracteres = dominio.toCharArray();

        for (char caractere : caracteres) {
//System.out.println(caractere);
            if (!Character.isLetter(caractere) || Character.isUpperCase(caractere)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validarSufixo(String sufixo) {
        if (sufixo.length() != 3) {
            return false;
        }
        char[] arrayCaracteres = sufixo.toCharArray();

        for (char caracter : arrayCaracteres) {
            System.out.println(caracter);
            if (!Character.isLetter(caracter) || Character.isUpperCase(caracter)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAlfaNumerico(char ch) {
        return Character.isLetter(ch) || Character.isDigit(ch);
    }
}