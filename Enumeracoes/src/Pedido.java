public class Pedido {

    private String nomeCliente;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private Origem origem = Origem.BALCAO;
    private Double valor;

    public StatusPedido getStatus() {
        return status;
    }

    //public void setStatus(StatusPedido status) {this.status = status;}

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
        if (StatusPedido.RASCUNHO.equals(getStatus()) ||
                StatusPedido.EMITIDO.equals(getStatus()) && this.valor < 100) {
            this.status = StatusPedido.CANCELADO;
        }
        throw new IllegalStateException("Pedido Não pode ser cancelado");
    }

}
