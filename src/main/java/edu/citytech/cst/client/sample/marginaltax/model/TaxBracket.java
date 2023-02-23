package edu.citytech.cst.client.sample.marginaltax.model;

/*

"end": 10275.0,
            "no": 1.0,
            "start": 0.0,
            "taxPaid": 1027.5,
            "taxRate": 0.1
 */

public class TaxBracket {

    private String code;
    private float no;
    private float taxRate;
    private float start;
    private float end;
    private float taxPaid;

    public float getTaxPaid() {
        return taxPaid;
    }

    public String getCode() {
        return code;
    }

    public float getNo() {
        return no;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public float getStart() {
        return start;
    }

    public float getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "TaxBracket{" +
                "code='" + code + '\'' +
                ", no=" + no +
                ", taxRate=" + taxRate +
                ", start=" + start +
                ", end=" + end +
                ", taxPaid=" + taxPaid +
                '}';
    }
}
