package operacoes;

public class Pow {
    public static void main(String[] args) {
        double x = 100;
        double y = 2;
        /*A operação pow recebe como parametro 2 doubles
         * e faz a potencia deles, primeiro valor é o numero que será
         * elevado, e o segundo valor é o valor da pontencia*/
        double z = Math.pow(x, y);

        //10_000
        System.out.println(z);

    }
}
