package classes_aninhadas_estaticas;

public class MensagemExemplo {
    private final String remetente;
    private final String destinatario;
    private final String texto;

    public MensagemExemplo(String remetente, String destinatario, String texto) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.texto = texto;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getTexto() {
        return texto;
    }
}


