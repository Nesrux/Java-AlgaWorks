package operacoes;

public class Round {
    public static void main(String[] args) {
        double x = 100.4;
        double y = 100.5;

        /*O round faz algo parecido com o ceil e com o floor, no mesmto metodo
         * ele arredonda para cima ou para baixo, isso depende se a casa decimal
         * esta antes do 5 ou depois do 5, se estiver antes ele vai arredondar para
         * baixo, se eles estiver no 5 ou superior ele arredonda para cima */
        System.out.println(Math.round(x));
        System.out.println(Math.round(y));

    }
}
