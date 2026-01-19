package com.fitnesstracker;

public class FitnessTracker {

    //method that bubble sort to rank users
    private static void sortStepsByRanking(int[] dailyStepCounts) {
        int totalUsers = dailyStepCounts.length;
        boolean isSwapped;
        //bubble Sort logic
        for (int pass = 0; pass < totalUsers - 1; pass++) {
            isSwapped = false;
            for (int currentIndex = 0; currentIndex < totalUsers - pass - 1; currentIndex++) {
                if (dailyStepCounts[currentIndex] < dailyStepCounts[currentIndex + 1]) {
                    int tempSteps = dailyStepCounts[currentIndex];
                    dailyStepCounts[currentIndex] = dailyStepCounts[currentIndex + 1];
                    dailyStepCounts[currentIndex + 1] = tempSteps;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        //daily step count of users
        int[] dailyStepCounts = {
                8200, 10500, 7600, 9800, 12000
        };
        sortStepsByRanking(dailyStepCounts);

        System.out.println("Daily step Count leaderboard:");
        for (int steps : dailyStepCounts) {
            System.out.println(steps + " steps");
        }
    }
}
