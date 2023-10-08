package validacoes.strings;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String nome = "João";
        String nome2 = new String("JOÃO");
        //iqualsIgnoreCase verifica se o conteudo das String são iguais
        // ignorando se estão em maiuscula ou minuscula.
        System.out.println(nome.equalsIgnoreCase(nome2));
    }
}
