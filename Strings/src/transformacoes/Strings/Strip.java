package transformacoes.Strings;

public class Strip {
    public static void main(String[] args) {
        String nome = " > " + "\n Pedro   *" + " <";
        //Strip remove os espaços em branco dos
        //cantos das Strings, nexessa caso o
        // \n
        System.out.println(nome);
        System.out.println(nome.strip());
    }
}
