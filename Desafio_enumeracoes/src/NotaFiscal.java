public class NotaFiscal {


    private final Integer numero;
    private final String descricao;
    private final double valor;
    private Status status = Status.NAO_EMITIDA;

    public NotaFiscal(Integer numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Status getStatus() {
        return status;
    }

    private void setStatus(Status status) {
        this.status = status;
    }

    public void cancelar() {
        if ((Status.EMITIDA.equals(getStatus()) && getValor() >= 1_000)
                || Status.CANCELADA.equals(getStatus())) {
            throw new IllegalStateException("Não foi possível cancelar a nota fiscal");
        }

        setStatus(Status.CANCELADA);
    }

    public void emitir() {
        if (Status.EMITIDA.equals(getStatus()) || Status.CANCELADA.equals(getStatus())) {
            throw new IllegalStateException("Não foi possível emitir a nota fiscal");
        }

        setStatus(Status.EMITIDA);
    }

    public String getDescricaoCompleta() {
        return String.format("Nota fiscal #%d (%s) no valor de R$%.2f está %s",
                getNumero(), getDescricao(), getValor(), getStatus());
    }

}