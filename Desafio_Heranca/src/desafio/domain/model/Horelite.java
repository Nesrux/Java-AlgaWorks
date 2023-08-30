package desafio.domain.model;

public record Horelite (String nome, String anoMes, double valorSalario){
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de admição: " + anoMes);
        System.out.println("Salario: " + valorSalario);
    }
}
