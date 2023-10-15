package classes_aninhadas_estaticas.enumAninhado;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jão", 74);
        cliente.setStatus(Cliente.Status.BLOQUEADO);
    }
}
