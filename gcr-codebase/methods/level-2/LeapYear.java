import java.util.Scanner;
public class LeapYear{
	public static boolean findLeapYear(int year){
		if(year%4 == 0 && year%100 != 0 || year%400 == 0){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int year;
		while(true){
			System.out.println("Enter the year greater than 1582");
			int value = input.nextInt();
			if(value >= 1582){
				year = value;
				break;
			}
		}
		
		boolean result = findLeapYear(year);
		System.out.println(result ? "It's leap year" : "It's not leap year");
		input.close();
	}
}