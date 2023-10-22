package introducao;

import java.util.*;

public class ServicoReserva {
    private final Set<Reserva> reservas = new HashSet<>();

    public Collection<Reserva> getReservas() {
        return Collections.unmodifiableSet(reservas);
    }

    public void adicionar(Reserva reserva) {
        boolean reservaAdicionada = reservas.add(reserva);
        if (!reservaAdicionada) {
            throw new RuntimeException(
                    String.format("Reserva %s já existe", reserva.getCodigo()));
        }
    }

    public Optional<Reserva> buscar(String codigo) {
        Reserva reservaEncontrada = null;

        for (Reserva reserva : reservas) {
            if (reserva.getCodigo().equals(codigo)) {
                reservaEncontrada = reserva;
                break;
            }
        }
        return Optional.ofNullable( reservaEncontrada);
    }
}
