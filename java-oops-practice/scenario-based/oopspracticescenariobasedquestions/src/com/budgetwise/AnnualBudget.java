package com.budgetwise;

import java.util.HashMap;

public class AnnualBudget extends Budget {

    public AnnualBudget(double income, HashMap<String, Double> categoryLimits) {
        super(income, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("Annual Budget Report");
        System.out.println("Annual Income: " + income);
        System.out.println("Annual Expenses: " + getTotalExpenses());
        System.out.println("Annual Savings: " + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Yearly Overspend Analysis:");
        for (String cat : categoryLimits.keySet()) {
            double spent = 0;
            for (Transaction t : getTransactions()) {
                if (t.getCategory().equals(cat)) {
                    spent += t.getAmount();
                }
            }
            if (spent > categoryLimits.get(cat)) {
                System.out.println("Alert: High spending in " + cat);
            }
        }
    }
}
