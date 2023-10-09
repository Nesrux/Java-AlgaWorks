package exemplos.formatacao;

public class FormatacaoNome {
    public static void main(String[] args) {
        String nome = "  João marcos de sousa rebelo  ";
        System.out.println(formatarNome(nome));
    }

    public static String formatarNome(String nome, String... preposicoes) {
        String novoNome = nome.strip();

        for (String preposicao : preposicoes) {
            novoNome = nome.replace(preposicao, "");
        }
        return novoNome;
    }
}
