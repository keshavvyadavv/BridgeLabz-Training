// Create SpringSeason class to check spring season 
public class SpringSeason{
	public boolean checkSpringSeason(int month , int day){
		if(month == 3 && 20 <= day || month == 4 ||month == 5 || month == 6 && day <= 20){
			return true;
		}
		return false;
	}
	public static void main(String [] args){
		
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		// Create SpringSeason object 
		SpringSeason sSeason = new SpringSeason();
		boolean result = sSeason.checkSpringSeason(month, day);
		
		// Print the result
		System.out.println(result ? "Its a Spring Season" : "Not a Spring Season");
		
	}
}