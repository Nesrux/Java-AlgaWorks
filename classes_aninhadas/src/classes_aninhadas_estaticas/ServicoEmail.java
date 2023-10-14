package classes_aninhadas_estaticas;

public class ServicoEmail {
    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando mensagem de %s para %s: %s%n", mensagem.getRemetente(),
                mensagem.getDestinatario(), mensagem.getTexto());
    }
}
