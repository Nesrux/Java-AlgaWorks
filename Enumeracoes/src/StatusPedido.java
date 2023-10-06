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
}
