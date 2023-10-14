package bigDecimal.formatacao;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatacaoCompacta {
    public static void main(String[] args) {
        //Comvenensão CLDR
        //Formatação numerica compacta
        BigDecimal a = new BigDecimal("1234");
        BigDecimal b = new BigDecimal("65432");
        BigDecimal c = new BigDecimal("45123456.654");
        BigDecimal d = new BigDecimal("654321.321");
        BigDecimal e = new BigDecimal("-99854586896.7861556");


        NumberFormat format = NumberFormat.getCompactNumberInstance(new Locale("pt", "BR"),
                NumberFormat.Style.LONG);

        System.out.println(format.format(a));
        System.out.println(format.format(b));
        System.out.println(format.format(c));
        System.out.println(format.format(d));
        System.out.println(format.format(e));

    }
}
