package com.LoanBuudy;

// create LoanMain to test the program
public class LoanMain {
    public static void main(String[] args) {

        Applicant applicant = new Applicant("Abhi Raj", 700, 70000, 500000);
        LoanApplication loan = new HomeLoan(applicant, 7.5, 240);
        loan.approveLoan();
        // 
        if (loan.isApproved()) {
            System.out.println("Monthly EMI: " + loan.calculateEmi());
        }
    }
}
