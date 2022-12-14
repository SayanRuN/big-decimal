package lesson_3_2.task_2.tax_type;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal("100000")) <= 0) {
            return amount.multiply(new BigDecimal("0.10"));
        }
        return amount.multiply(new BigDecimal("0.15"));
    }
}
