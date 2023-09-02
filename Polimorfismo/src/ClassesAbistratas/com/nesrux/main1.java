package ClassesAbistratas.com.nesrux;

import ClassesAbistratas.com.nesrux.domain.GestorFiscal;
import ClassesAbistratas.com.nesrux.domain.NotaFiscalProduto;
import ClassesAbistratas.com.nesrux.domain.NotaFiscalServico;

public class main1 {
    public static void main(String[] args) {
        var nfBolaFutebol = new NotaFiscalProduto("Bola de futebol", 150, 100);

        var nfReparoMotor = new NotaFiscalServico("Reparo do motor", 2000, true);

        GestorFiscal gestorFiscal = new GestorFiscal();
        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

    }
}
