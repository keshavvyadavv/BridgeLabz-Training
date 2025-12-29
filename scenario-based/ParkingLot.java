//Create parking lot system that works on option based systen
import java.util.Scanner;
public class ParkingLot{
	public static void main(String [] args){
		
		int totalCapcity = 100;
		int currentOccupancy = 0;
		int avaliableSpace = 100;
		while(true){
				
			System.out.println("Welcome to parking lot gate system: ");
			System.out.println("Enter P for parking \nEnter E for exit your car from parking lot.\nEnter O from parking detailes");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			//switch cases for options
			switch(input){
				case "P" : {
							System.out.println("parked successfully at "+(currentOccupancy+1)+ " this number.");
							currentOccupancy++;
							avaliableSpace--;
						}
						break;
				case "E" : {
							if(currentOccupancy == 0){
								System.out.println("No, car is there.");
								break;
							}
							System.out.println("Thanks from parking. ");
						}
						break;
				case "O" : {
							System.out.println("Total occupancy is: " +totalCapcity+ 
								". Current capacity is: "+currentOccupancy+
								". Avaliable slots is: "+avaliableSpace);
						}
						break;
				default : {
							System.out.println("Your have enter invail digit");
						}
			}
			//break when slot is full
			if(currentOccupancy == totalCapcity){
				System.out.println("The praking slots is full.");
				break;
			}
			if(input.equals("E")){
				break;
			}
			
		}
	}
}