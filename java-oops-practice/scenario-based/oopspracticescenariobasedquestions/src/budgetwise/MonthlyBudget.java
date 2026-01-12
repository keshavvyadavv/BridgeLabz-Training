package budgetwise;

import java.util.HashMap;

public class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, HashMap<String, Double> categoryLimits) {
        super(income, categoryLimits);
    }

    public void generateReport() {
        System.out.println("📅 Monthly Budget Report");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + getTotalExpenses());
        System.out.println("Savings: " + calculateSavings());
    }

    public void detectOverspend() {
        System.out.println("Monthly Overspend Check:");
        for (String cat : categoryLimits.keySet()) {
            double spent = 0;
            for (Transaction t : getTransactions()) {
                if (t.getCategory().equals(cat)) {
                    spent += t.getAmount();
                }
            }
            if (spent > categoryLimits.get(cat)) {
                System.out.println(cat + " exceeded limit!");
            }
        }
    }
}
