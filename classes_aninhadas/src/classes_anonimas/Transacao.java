package classes_anonimas;

import java.math.BigDecimal;

public interface Transacao {
    BigDecimal getValorTotal();

    void reembolsar();
}
