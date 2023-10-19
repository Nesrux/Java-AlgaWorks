package introducao;

import java.util.Objects;

public class Reserva {
    private final String codigo;
    private final Voo voo;
    private final Passageiro passageiro;
    private int qtdaBagagens;

    public Reserva(String codigo, Voo voo, String nomePassageiro) {
        Objects.requireNonNull(codigo);
        Objects.requireNonNull(voo);
        Objects.requireNonNull(nomePassageiro);

        this.codigo = codigo;
        this.voo = voo;
        this.passageiro = new Passageiro(nomePassageiro);

    }

    public String getCodigo() {
        return codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public int getQtdaBagagens() {
        return qtdaBagagens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reserva reserva = (Reserva) o;

        return codigo.equals(reserva.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", voo=" + voo +
                ", passageiro=" + passageiro +
                '}';
    }
}
