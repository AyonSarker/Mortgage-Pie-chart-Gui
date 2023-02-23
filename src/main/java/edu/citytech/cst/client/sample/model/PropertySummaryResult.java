package edu.citytech.cst.client.sample.model;

import edu.citytech.cst.client.sample.Property.model.PropertySummary;

import java.util.Arrays;

public class PropertySummaryResult {

    private String developer;
    private PropertySummary[] properties;

    public String getDeveloper() {
        return developer;
    }

    public PropertySummary[] getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "PropertySummaryResult{" +
                "developer='" + developer + '\'' +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }
}


