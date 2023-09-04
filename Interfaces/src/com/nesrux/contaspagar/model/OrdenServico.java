package com.nesrux.contaspagar.model;

import com.nesrux.pagamento.Beneficiario;
import com.nesrux.pagamento.DocumentoPagavel;

public class OrdenServico implements DocumentoPagavel {

    private Beneficiario fornecedor;
    private double valorTotal;


    public OrdenServico(Beneficiario fornecedor, double valorTotal) {
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
    }

    public Beneficiario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Beneficiario fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFornecedor();
    }
}
