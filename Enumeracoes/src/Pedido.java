public class Pedido {

    private String nomeCliente;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private Origem origem = Origem.BALCAO;
    private Double valor;

    public StatusPedido getStatus() {
        return status;
    }

    //public void setStatus(StatusPedido status) {this.status = status;}

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void entregar() {
        this.status = StatusPedido.EMITIDO;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public int getTempoEntregueEmHoras() {
        return status.getTempoEmHoras();
    }

    public void cancelar() {
        status.podeMudarParaCancelado(getValor());
    }

}
