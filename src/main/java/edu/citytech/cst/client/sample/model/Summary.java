package edu.citytech.cst.client.sample.model;


public class Summary {

    private double cumulativeInterest;
    private double totalPrincipal;

    public double getCumulativeInterest() {
        return cumulativeInterest;

    }

    public void setCumulativeInterest(double cumulativeInterest) {
        this.cumulativeInterest = cumulativeInterest;
    }

    public double getTotalPrincipal() {
        return totalPrincipal;

    }

    public void setTotalPrincipal(double totalPrincipal){
        this.totalPrincipal = totalPrincipal;
    }

    @Override
    public String toString() {
        return "Summary{" +
                "cumulativeInterest=" + cumulativeInterest +
                ", totalPrincipal=" + totalPrincipal +
                '}';
    }
}
