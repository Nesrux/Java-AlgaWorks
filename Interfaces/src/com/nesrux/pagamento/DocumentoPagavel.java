package com.nesrux.pagamento;

public interface DocumentoPagavel {

    public abstract double getValorTotal();

    //é exatamente igual, se não colocar o public abstract isso vai ficar implicito
    // no código
    Beneficiario getBeneficiario();
}
