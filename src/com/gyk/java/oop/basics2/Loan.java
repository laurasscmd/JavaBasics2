package com.gyk.java.oop.basics2;

public class Loan {
    private int loanID;
    private float amount;
    private LoanType loanType;
    private String terminationDate;

    public Loan() {

        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanID=" + loanID +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", terminationDate='" + terminationDate + '\'' +
                '}';
    }
}
