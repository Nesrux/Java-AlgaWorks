package validacoes.strings;

public class Contains {
    public static void main(String[] args) {
        String nome = "joao marcos de sousa rebelo";

        //contains verifica se existem uma um determinado connjunto de letras dentro daquela String
        // independente de em que ponto da string esse conjunto aparece

        System.out.println(nome.contains("marcos"));
    }


}
