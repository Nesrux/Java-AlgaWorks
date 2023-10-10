package boasPraticas;

public class Principal {
    public static void main(String[] args) {
        //String builder
        long tempoInicio = System.currentTimeMillis();

        //String texto = "";
        StringBuilder sb = new StringBuilder(210_000);
        //ele utiliza arrays ao invés de string, por isso o contrutor dele
        //recebe o tamanho do array

        for (int i = 0; i < 200_000; i++) {
            //texto = texto + "#";
            sb.append("#");
        }
        System.out.println(sb.toString());
        double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
        System.out.printf("Duração: %.2f%n", duracao);
        // com a concatenaçao "+" 5
        // media de 5  segundo para rodar esse algoritimo

        //com o String builder esse mesmo código demora 0,04
    }
}