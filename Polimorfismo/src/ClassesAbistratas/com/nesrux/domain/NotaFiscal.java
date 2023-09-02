package ClassesAbistratas.com.nesrux.domain;

public class NotaFiscal {
    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public double calcularImposto(){
        return 0;
    }
}
