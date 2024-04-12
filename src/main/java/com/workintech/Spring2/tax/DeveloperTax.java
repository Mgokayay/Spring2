package com.workintech.Spring2.tax;

import org.springframework.stereotype.Component;

@Component
public class DeveloperTax implements Taxable{
    @Override
    public Double getSimpleTaxRate() {
        return 15d;
    }

    @Override
    public Double getMiddleTaxRate() {
        return 25d;
    }

    @Override
    public Double getUpperTaxRate() {
        return 35d;
    }
}
