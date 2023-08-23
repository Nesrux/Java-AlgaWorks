package aula01;

public class Recibo {
    public String titular;
    public String descricao;

    public double valor;
    public Recibo(String titular, String descricao, double valor ){
        this.titular = titular;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println("------------------------------- ");
        System.out.printf("RECIBO PARA %s ", titular);
        System.out.printf("%s -> R$ %2f %n", descricao, valor);
        System.out.println("-------------------------------");

    }
}
