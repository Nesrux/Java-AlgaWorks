public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setStatus(StatusPedido.EMITIDO);
        pedido.setOrigem(Origem.BALCAO);
        //Adicionando valores a uma enumeração
        //Ele vai para o ultimo da lista, então vira a posição 6


        //Iterando uma enumeração
        for (StatusPedido status : StatusPedido.values()) {
            System.out.printf("%d - %s %n", status.ordinal(), status.name());
        }

        String novoStatus = "MODIFICADO";
        StatusPedido statusNovo = StatusPedido.valueOf(novoStatus);
        System.out.println(statusNovo.ordinal() + " " + statusNovo.name());
    }
}
