package classes_aninhadas_estaticas.exemplo2;

public class Principal {
    public static void main(String[] args) {
        ServicoEmail servico = new ServicoEmail();
        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem("JoãoMarcos@gmail.com",
                "MarinaPedroso@outlook.com", "SALVE CACHORRO BELGA, FIRMEZA ?" +
                "TOU AQUI NA HUMILDA TE CONVIDANO PARA MEU CASAMENTO PARSA, BORA FECHAR ? (convite em anexo)");
        servico.enviar(mensagem);
    }
}
