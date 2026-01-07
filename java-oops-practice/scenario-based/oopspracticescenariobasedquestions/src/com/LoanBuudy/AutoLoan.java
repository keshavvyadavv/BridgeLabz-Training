package com.LoanBuudy;

//Create AutoLoan class 
public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, double interestRate, int termInMonths) {
        super(applicant, interestRate, termInMonths);
    }

    @Override
    public void approveLoan() {
        if (applicant.getCreditScore() >= 600) {
            setApproved(true);
            System.out.println("Auto Loan Approved");
        } else {
            System.out.println("Auto Loan Rejected");
        }
    }

    // create method to get calculateEmi
    public double calculateEmi() {
        double P = applicant.getLoanAmount();
        double R = (interestRate + 1) / (12 * 100);
        int N = termInMonths;
        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
