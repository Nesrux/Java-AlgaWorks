public enum StatusPedido {
    RASCUNHO,
    ENTREGUE,
    CANCELADO,
    EMITIDO(12),
    FATURADO(10),
    SEPARADO(5),
    DESPACHADO(2);

    private Integer tempoEmHoras;

    StatusPedido(int tempoEntregueEmHoras) {
        this.tempoEmHoras = tempoEntregueEmHoras;
    }

    StatusPedido() {
    }

    public Integer getTempoEmHoras() {
        return tempoEmHoras;
    }

    public boolean podeMudarParaCancelado(double valorPedido) {
        return StatusPedido.RASCUNHO.equals(this) ||
                StatusPedido.EMITIDO.equals(this) && valorPedido < 100;
    }
}
