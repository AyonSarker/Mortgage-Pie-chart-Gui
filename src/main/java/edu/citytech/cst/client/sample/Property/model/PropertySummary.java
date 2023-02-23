package edu.citytech.cst.client.sample.Property.model;

public class PropertySummary {

    private String state;
    private float netIncome;

    public String getState() {
        return state;
    }

    public float getIncome() {
        return netIncome;
    }

    @Override
    public String toString() {
        return "PropertySummary{" +
                "state='" + state + '\'' +
                ", netIncome=" + netIncome +
                '}';
    }
}
