package com.LoanBuudy;

//create LoanApplication that is a base class 
public abstract class LoanApplication implements IApprovable {
	// protected data
    protected Applicant applicant;
    protected double interestRate;
    protected int termInMonths;
    private boolean approved;
    // constructor
    public LoanApplication(Applicant applicant, double interestRate, int termInMonths) {
        this.applicant = applicant;
        this.interestRate = interestRate;
        this.termInMonths = termInMonths;
        this.approved = false;
    }
    // set approval status
    protected void setApproved(boolean status) {
        this.approved = status;
    }
    //get approve data
    public boolean isApproved() {
        return approved;
    }
}
