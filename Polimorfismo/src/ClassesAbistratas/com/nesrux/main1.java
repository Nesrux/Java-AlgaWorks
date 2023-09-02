package ClassesAbistratas.com.nesrux;

import ClassesAbistratas.com.nesrux.domain.NotaFiscal;
import ClassesAbistratas.com.nesrux.domain.NotaFiscalProduto;
import ClassesAbistratas.com.nesrux.domain.NotaFiscalServico;

public class main1 {
    public static void main(String[] args) {
        var nfBolaFutebol = new NotaFiscalProduto("Bola de futebol", 150, 100);
        var nfReparoMotor = new NotaFiscalServico("Reparo do motor", 2000, true);
    }
}
