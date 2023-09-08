package com.nesrux.locadora;

public class SeguroSantander implements Seguro {
    @Override
    public double valorPremio(int horasUtilizadas, double valorContrato) {
        return (horasUtilizadas * .5) + (valorContrato * .05);
    }
}
