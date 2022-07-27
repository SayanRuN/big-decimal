package lesson_3_2.task_2;

import lesson_3_2.task_2.tax_type.TaxType;

import java.math.BigDecimal;

public class Bill {

    private final BigDecimal amount;
    private final TaxType taxType;
    private final TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}
