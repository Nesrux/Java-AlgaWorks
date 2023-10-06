public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setStatus(Pedido.STATUS_EMITIDO);

        pedido.setOrigem(Pedido.ORIGEM_ONLINE);
        System.out.println(Pedido.getDescricaoStatus(2));

    }
}
