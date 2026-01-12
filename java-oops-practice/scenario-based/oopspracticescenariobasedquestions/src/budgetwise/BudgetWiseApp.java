package budgetwise;

import java.util.HashMap;
//Create BudgetWiseApp 
public class BudgetWiseApp {
    public static void main(String[] args) {

        HashMap<String, Double> limits = new HashMap<>();
        limits.put("Food", 5000.0);
        limits.put("Travel", 3000.0);
        //create the object of budget
        Budget budget = new MonthlyBudget(20000, limits);

        budget.addTransaction(new Transaction(2000, "EXPENSE", "Food"));
        budget.addTransaction(new Transaction(4000, "EXPENSE", "Travel"));

        budget.generateReport();
        budget.detectOverspend();
    }
}
