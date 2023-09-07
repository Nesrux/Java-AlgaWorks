package com.nesrux.financeira;

import com.nesrux.financeira.interfaces.ClienteFinanciavel;
import com.nesrux.financeira.modelo.Fazenda;
import com.nesrux.financeira.modelo.Funcionario;
import com.nesrux.financeira.modelo.Industria;
import com.nesrux.financeira.servico.ServicoFinanciamento;

public class Principal {
    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var funcionario = new Funcionario("Juliano almeida", 18_000);

        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 540_000);
        servicoFinanciamento.solicitarFinanciamento(funcionario, 10_000);

        //Numero teste é uma constante!
        System.out.println(ClienteFinanciavel.JUROS_ALTO_RISCO);
    }
}
