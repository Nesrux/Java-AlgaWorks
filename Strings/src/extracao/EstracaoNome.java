package extracao;

public class EstracaoNome {
    public static void main(String[] args) {
        String nome = "Maria josiana vieira de sousa";
        /*o método substring recebe um indice (int) e retorna toda a sequencia de
         * caracteres depois desse indice, nesse exemplo, ele esta pegando esse indice
         * do primeiro "espaço" na nome da pessoa que no caso é o indice 5
         * e depois esta retornando toda a sequencia de caracteres posteriores*/
        System.out.println(nome.substring(nome.indexOf(" "))); //retorno josiana vieira de sousa
    }
}
