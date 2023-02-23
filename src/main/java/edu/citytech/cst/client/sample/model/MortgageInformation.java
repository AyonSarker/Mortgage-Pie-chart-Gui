package edu.citytech.cst.client.sample.model;

public class MortgageInformation {

    private double interest;
    private double year;
    private  double loanAmount;
    private Summary mortgageSummary;


   public double getMonthlyPayment(){
       return monthlyPayment;
   }
   public void setMonthlyPayment(double monthlyPayment){
       this.monthlyPayment = monthlyPayment;
   }
   private double monthlyPayment;

    public double getYear() { return year;}

    public  void setYear(double year){this.year = year;}

    public double getInterest(){ return interest;}

    public  void setInterest(double interest){this.interest = interest;}

    public double getLoanAmount(){ return loanAmount;}

    public  void setLoanAmount(double loanAmount){this.loanAmount = loanAmount;}

    @Override
    public String toString() {
        return "MortgageInformation{" +
                "interest=" + interest +
                ", year=" + year +
                ", loanAmount=" + loanAmount +
                ", mortgageSummary=" + mortgageSummary +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }

    public Summary getMortgageSummary() {
        return this.mortgageSummary;
    }
}
