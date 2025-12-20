import java.util.Scanner;
public class AthleteRound{
	public int triangleRound(double sideOne, double sideSecond, double sideThird){
		double perimeterOfTriangle = sideOne+sideThird+sideSecond;
		int needToCover = 5000;
		int rounds = (int)(needToCover/perimeterOfTriangle);
		return rounds;
		
	}

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of side one of triangle in meters: ");
		double sideOne = input.nextDouble();
		System.out.println("Enter the length of side second of triangle in meters: ");
		double sideSecond = input.nextDouble();
		System.out.println("Enter the length of side third of triangle in meters: ");
		double sideThird = input.nextDouble();
		AthleteRound athleteRound = new AthleteRound();
		int result = athleteRound.triangleRound(sideOne , sideSecond, sideThird);
		
		System.out.println("The total number of rounds is : "+result);
		input.close();
		
	}
	
}