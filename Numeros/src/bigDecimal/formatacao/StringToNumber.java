package bigDecimal.formatacao;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class StringToNumber {
    public static void main(String[] args) throws ParseException {
        String texto = "1.000,43";
        DecimalFormat format = new DecimalFormat("#,##0,00");
        format.setParseBigDecimal(true);
        BigDecimal valor = (BigDecimal) format.parse(texto);
        BigDecimal total = valor.add(new BigDecimal("1000"));

        System.out.println(valor.getClass());
        System.out.println(valor);
        System.out.println(total);
    }
}
