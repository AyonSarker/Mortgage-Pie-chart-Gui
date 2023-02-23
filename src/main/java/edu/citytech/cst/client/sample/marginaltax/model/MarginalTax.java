package edu.citytech.cst.client.sample.marginaltax.model;

import java.util.Arrays;

public class MarginalTax {

    private float percentage;

    private float taxPaid;
    private TaxBracket[] taxList;

    public float getPercentage() {
        return percentage;
    }

    public float getTaxPaid() {
        return taxPaid;
    }

    public TaxBracket[] getTaxList() {
        return taxList;
    }

    @Override
    public String toString() {
        return "MarginalTax{" +
                "percentage=" + percentage +
                ", taxPaid=" + taxPaid +
                ", taxList=" + Arrays.toString(taxList) +
                '}';
    }
}
