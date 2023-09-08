package com.nesrux.locadora;

public class SeguroItau implements Seguro {
    @Override
    public double valorPremio(int horasUtilizadas, double valorContrato) {
        var dias = Math.ceil(horasUtilizadas / 24d);
        return dias * 5;
    }
}
