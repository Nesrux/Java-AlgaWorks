package operacoes;

public class Abs {
    public static void main(String[] args) {
        float x = -100.5F;
        float y = 100.5F;

        //O método abs devolve o valor absoluto, ou seja sem
        //o ponto flutuante e sem sinal negativo!
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));
    }
}
