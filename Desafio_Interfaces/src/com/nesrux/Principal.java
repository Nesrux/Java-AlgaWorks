package com.nesrux;

import com.nesrux.model.Caminhao;
import com.nesrux.model.CarroParticular;
import com.nesrux.model.ImovelResidencial;
import com.nesrux.service.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {
        ImovelResidencial imovel = new ImovelResidencial(100_000, 100);
        CarroParticular carro = new CarroParticular("Hyndai", 75_000, 2000);
        Caminhao caminhao = new Caminhao("Honda", 150_000, 2010, 10);
        ServicoPropostaSeguro servico = new ServicoPropostaSeguro();

         servico.emitir(imovel);
        servico.emitir(carro);
        servico.emitir(caminhao);
    }
}
