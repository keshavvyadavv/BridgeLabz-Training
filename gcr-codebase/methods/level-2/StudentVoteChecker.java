// Create StudentVoteChecker class to check the voting elibility
import java.util.Scanner;
public class StudentVoteChecker {
	public boolean canStudentVote(int age){
		if(age < 0){
			return false;
		}
		else if(age >= 18){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		int [] persons = new int[10];
		for(int index = 0 ; index < 10 ; index++){
			System.out.println("Enter the number: ");
			persons[index] = input.nextInt();
		}
		
		// print result
		StudentVoteChecker stdVoteObj = new StudentVoteChecker();
		for(int index = 0;index <10;index++){
			System.out.println(stdVoteObj.canStudentVote(persons[index]) ?(index+1)+"th person "+ 
								" you can vote." :(index+1)+"th person "+ " you cannot vote.");			
		}
	}
}