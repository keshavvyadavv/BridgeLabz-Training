// Create PrimeNumber class that check if the given number is a 
//prime number or not

import java.util.Scanner;
public class PrimeNumber{
	public static void main (String[] args){
		
		// Create a Scanner Object and take number as input
		int number;
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		number = input.nextInt();
		boolean isPrime = true;
		// if number is less then 1 then it is not a prime number
		if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
		
		// print the number is prime or not
		System.out.println( number + " " + ( isPrime ? "is a prime number" : "is not a prime number"));
		input.close();
	}
}