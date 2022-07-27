package lesson_3_2.task_2;

import lesson_3_2.task_2.tax_type.IncomeTaxType;
import lesson_3_2.task_2.tax_type.ProgressiveTaxType;
import lesson_3_2.task_2.tax_type.VATaxType;

import java.math.BigDecimal;

public class Task {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("100000"), new VATaxType(), taxService),
                new Bill(new BigDecimal("130000"), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal("70000"), new IncomeTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}

