//Create a MCQ class that ask question to users
import java.util.Scanner;
public class MCQ{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		//store the question
		String[] question = {
							  "1. What is Java?\n"
							  + "a. A programming language\n"
							  + "b. An operating system\n"
							  + "c. A database\n"
							  + "d. A browser",

								"2. Which keyword is used to create an object in Java?\n"
							  + "a. class\n"
							  + "b. new\n"
							  + "c. object\n"
							  + "d. create",

								"3. Which method is the entry point of a Java program?\n"
							  + "a. start()\n"
							  + "b. run()\n"
							  + "c. main()\n"
							  + "d. init()",

								"4. Which of the following is not a Java access modifier?\n"
							  + "a. public\n"
							  + "b. private\n"
							  + "c. protected\n"
							  + "d. global",
								"5. Which keyword is used to inherit a class in Java?\n"
							  + "a. inherit\n"
							  + "b. implements\n"
							  + "c. extends\n"
							  + "d. super"
							};
		//store the answer..
		char[] answer = {'a', 'b', 'c', 'd', 'c'};
		//ask question to user
		for(int i = 0 ; i < question.length ; i++){
			System.out.println(question[i]);
			System.out.println("Enter a , b , c , d");
			char userAnswer = input.next().charAt(0);
			char correct = answer[i];
			if(userAnswer == correct){
				System.out.println("Yes, your answer is correct.");
			}
			else if(userAnswer != 'a' && userAnswer != 'b' && userAnswer != 'c' && userAnswer != 'd' ){
				System.out.println("Invaild option enter");
			}
			else{
				System.out.println("Wrong, answer! the correct answer is"+correct);
			}
		}
		
	}
}