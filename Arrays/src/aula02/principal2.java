package aula02;

public class principal2 {
    public static void main(String[] args) {
        int[] notas = {9, 8, 4, 6, 7, 8, 3, 5, 4};
        double media = Caluladora.calcularMedia(notas);

        System.out.println("A média é " + media);
    }
}
