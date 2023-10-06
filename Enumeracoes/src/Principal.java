public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setStatus(StatusPedido.EMITIDO);

        pedido.setOrigem(Origem.BALCAO);
    }
}
