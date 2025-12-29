//9. School Bus Attendance System 🚍
//Track 10 students' presence.
//● Use for-each loop on names.
//● Ask "Present or Absent?"
//● Print total present and absent counts.

import java.util.Scanner;
public class BusAttendanceSystem{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		String [] names = {"Keshav","ankit", "ramesh","sanchit","aviral","mahak","rajeev", "ayush","anuj","vikash"};
		String [] attendence = new String[10];
		int presentCount = 0;
		int absentCount = 0;
		for(int i = 0 ; i < names.length ; i++){
			System.out.println(names[i]+" is present ? (enter P for present and A for absent)");
			char ch = input.next().charAt(0);
			switch(ch){
				case 'P' : attendence[i] = "Present";
						 presentCount++;
						break;
				case 'A' : attendence[i] = "Absent";
						 absentCount++;
						 break;
				default : System.out.println("You have enter wrong Character"); 
						  i--;
			}
		}
		
		System.out.println("+----------------+------------+");
		System.out.println("| Student Name   |  Attendance|");
		System.out.println("+----------------+------------+");
		for(int i = 0 ; i < names.length ; i++){
			System.out.printf("| %-14s | %-10s |\n",names[i], attendence[i]);
		}
		System.out.println("+----------------+------------+");
		System.out.println("The total number of present student in bus is: "+presentCount
							+"\nThe total number of absent student in bus is: "+absentCount);
	}
}