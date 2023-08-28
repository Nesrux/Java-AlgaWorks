package aula06;

public class Principal1 {
    public static void main(String[] args) {
        Integer idade = 30;
        String nome = "joão";
        nome = "Thiago";

        System.out.printf("%s tem %d de idade%n", nome, idade);
        Horario horario = new Horario(5, 10);
        //Imutabilidade de classes integer e String são inmutaveis
        //Podendo serem re-atribuidos como nome = thiago
    }
}
