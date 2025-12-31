/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/
public class Watch{
	public static void main(String[] args){
		
		//Hours 0 to 24
		for(int i = 0 ; i < 24 ; i++){
			//power cut 
			if(i == 13){
				System.out.println("Power cut");
				break;
			}
			//mintunes 0 to 60
			for(int j = 0 ; j < 60 ; j++){
				if(j <= 9){
					if(i <= 9){
						System.out.println("0"+i +" : 0" +j);
					}
					else{
						System.out.println(i +" : 0" +j);
					}
				}
				else{
					if(i <= 9){
						System.out.println("0"+i +" : " +j);
					}
					else{
						System.out.println(i +" : " +j);
					}
				}
			}
		}
	}
}