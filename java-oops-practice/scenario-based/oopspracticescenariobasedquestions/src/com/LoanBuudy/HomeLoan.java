package com.LoanBuudy;
//Create HomeLoan class 
public class HomeLoan extends LoanApplication {
	
	// calling super class constructor
    public HomeLoan(Applicant applicant, double interestRate, int termInMonths) {
        super(applicant, interestRate, termInMonths);
    }

    @Override
    public void approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 50000) {
            setApproved(true);
            System.out.println("Home Loan Approved");
        } else {
            System.out.println("Home Loan Rejected");
        }
    }

    // method that calculate emi
    public double calculateEmi() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = termInMonths;
        return (P * R * Math.pow(1 + R, N)) /(Math.pow(1 + R, N) - 1);
    }
}
