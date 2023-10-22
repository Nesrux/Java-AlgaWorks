package introducao;

import java.util.Objects;
import java.util.Optional;

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
        Optional<Reserva> reservaOptional = servicoReserva.buscar(codigoReserva);

        if (reservaOptional.isEmpty()) {
            throw new ReservaNaoEncontradaException("Reserva não encontrada");
        }

        reservaOptional.get().adicionarBagagens(qtdaBagagens);
    }
}
