// Create ThreeFriendsInfo class to find the youngest 
//and tallest among 3 friends

import java.util.Scanner;
public class ThreeFriendsInfo {
    public static void main(String[] args){

        // Create a Scanner object to take input from the user
        Scanner input = new  Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony" };
        //Arrays to store age and height of the 3 friends
        int[] age = new int[3];
        double[] height = new double[3];
        // Taking input of age and height for each friend
        for(int i = 0; i < 3; i++){
            System.out.println("Enter the age of " + friends[i] + ":");
            age[i] = input.nextInt();
            System.out.println("Enter the height of " + friends[i] + " in cm:");
            height[i] = input.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;
        // Loop through the arrays to find youngest and tallest
        for(int i = 1; i < 3; i++){
            // Check for youngest
            if(age[i] < age[youngestIndex]){
                youngestIndex = i;
            }
            // Check for tallest
            if(height[i] > height[tallestIndex]){
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("The youngest friend is: " + friends[youngestIndex] +
		" with age " + age[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex] + 
		" with height " + height[tallestIndex] + " cm");
        input.close();
		
    }
}
