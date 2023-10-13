package operacoes;

public class Ceil {
    public static void main(String[] args) {
        double x = 100.1;
        double y = 100.9;

        //o método ceil, recebe um double e devolve o esse
        //número arredondado para cima, nesse caso ambos vão
        //ser 101
        System.out.println(Math.ceil(x));
        System.out.println(Math.ceil(y));

    }
}
