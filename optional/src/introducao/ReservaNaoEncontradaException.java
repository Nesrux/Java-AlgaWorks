package introducao;

public class ReservaNaoEncontradaException extends RuntimeException {
    public ReservaNaoEncontradaException() {
        super("Reserva não foi econtrada");
    }

    public ReservaNaoEncontradaException(String message) {
        super(message);
    }
}
