public class Pedido {

    private String nomeCliente;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private Origem origem = Origem.BALCAO;

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

}
