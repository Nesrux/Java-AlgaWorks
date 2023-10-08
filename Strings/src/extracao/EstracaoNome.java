package extracao;

public class EstracaoNome {
    public static void main(String[] args) {

        String nome = "Maria josiana vieira de sousa";
        /*o método substring recebe um indice (int) e retorna toda a sequencia de
         * caracteres depois desse indice, nesse exemplo, ele esta pegando esse indice
         * do primeiro "espaço" na nome da pessoa que no caso é o indice 5
         * e depois esta retornando toda a sequencia de caracteres posteriores*/

        System.out.println(nome.substring(nome.indexOf(" "))); //retorno josiana vieira de sousa
        //Ambos funcionam exatamente igual, porém i obtersobrenome possui uma validção
        System.out.println(obterSobrenome(nome));

        System.out.println(obterSegundoNome(nome));
    }

    public static String obterSobrenome(String nome) {
        int posicao = nome.indexOf(" ");
        if (posicao < 0) {
            throw new RuntimeException("O nome não possui um sobrenome");
        }
        return nome.substring(posicao);
    }

    public static String obterSegundoNome(String nome) {
        int posicaoInicial = nome.indexOf(" ");
        int posicaoFinal = nome.indexOf(" ", posicaoInicial + 1);
        if (posicaoInicial < 0) {
            throw new RuntimeException("O nome não possui um sobrenome");
        }
        return nome.substring(posicaoInicial, posicaoFinal < 0 ? nome.length() : posicaoFinal);
    }
}
