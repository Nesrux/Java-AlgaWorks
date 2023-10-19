package introducao;

import java.util.Objects;

public class ServicoBagagem {
    private ServicoReserva servicoReserva;

    public ServicoBagagem(ServicoReserva servicoReserva) {
        Objects.requireNonNull(servicoReserva);
        this.servicoReserva = servicoReserva;
    }


    public void contratar(String codigoReserva, int qtdaBagagens) {
        if (qtdaBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens inválida");
        }
        Reserva reserva = servicoReserva.buscar(codigoReserva);

        if (reserva == null) {
            throw new ReservaNaoEncontradaException("Reserva não existe");
        }
        reserva.adicionarBagagens(qtdaBagagens);
    }
}
