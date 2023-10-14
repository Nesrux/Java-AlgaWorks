package bigDecimal.formatacao;

import java.math.BigDecimal;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.US);
        //iso 1639 iso
        // Locale.setDefault(new Locale("pt", "BR"));
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));

        double a = 4_123_298.48595;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = new BigDecimal("48.57");

        //o ; (ponto e viergula) separa a formatação  dos numeros negativos
        // para os positivos
        //NumberFormat format = new DecimalFormat("\u00A4 #,##0.000;O valor é #,##0.000");
        NumberFormat format = NumberFormat.getCurrencyInstance();
        //editar o rounding mode
        //format.setRoundingMode(RoundingMode.CEILING);


        System.out.println(format.format(a));
        System.out.println(format.format(b));
        System.out.println(format.format(c));
        System.out.println(format.format(d));
    }
}
