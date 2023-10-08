package validacoes.strings;

public class IsBlank {
    public static void main(String[] args) {
        String nome = "";

        System.out.println(nome.length() == 0);

        //Tem a mesma implementação que essa
        System.out.println(nome.isEmpty());
    }
}
