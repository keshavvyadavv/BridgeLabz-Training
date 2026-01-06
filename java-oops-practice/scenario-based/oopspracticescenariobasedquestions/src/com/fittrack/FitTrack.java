package com.fittrack;

public class FitTrack {
 public static void main(String[] args) {

     UserProfile user = new UserProfile("Amit", 21, 68.5, "Build Muscle");

     Workout w1 = new CardioWorkout(30);
     Workout w2 = new StrengthWorkout(40);

     w1.startWorkout();
     w1.calculateCalories();
     w1.stopWorkout();

     w2.startWorkout();
     w2.calculateCalories();
     w2.stopWorkout();

     int dailyTarget = 600;

     // Operator usage
     int caloriesBurned = w1.getCaloriesBurned() + w2.getCaloriesBurned();
     int remaining = dailyTarget - caloriesBurned;

     System.out.println("Total Calories Burned: " + caloriesBurned);
     System.out.println("Remaining Calories to Target: " + remaining);
 }
}
