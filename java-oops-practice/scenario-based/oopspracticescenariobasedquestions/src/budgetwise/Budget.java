package budgetwise;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Budget implements IAnalyzable {

    protected double income;
    protected HashMap<String, Double> categoryLimits;
    private ArrayList<Transaction> transactions;

    //constructor with custom categories
    public Budget(double income, HashMap<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    //encapsulation: no direct editing
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equals("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }
    public double calculateSavings() {
        return income - getTotalExpenses();
    }

    protected ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
