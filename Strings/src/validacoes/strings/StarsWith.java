package validacoes.strings;

public class StarsWith {
    public static void main(String[] args) {
        String nome = "João";
        //StarsWith verifica se a String começa com determinada letra
        System.out.println(nome.startsWith("J"));

        //ele não faz a verificação se esta em maiúsculo ou minúsculo
        System.out.println(nome.startsWith("j"));


    }
}
