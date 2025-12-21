//create a FootballPalyer class to find the mean,shortest , tallest, and 
// sum of height.
public class FootballPalyer{
	//method that find sum of element
	public static int findSumOfElement(int [] height){
		int sum = 0;
		for(int index = 0 ; index < height.length ; index++){
			sum += height[index];
		}
		return sum;
	}
	//method for finding mean
	public static double findMeanOfElement(int [] height){
		int sum = 0;
		for(int index = 0 ; index < height.length ; index++){
			sum += height[index];
		}
		double mean = (double)(sum/height.length);
		return mean;
	}
	//method for find smallest height
	public static int findSmallestHeight(int [] height){
		int smallestElem = Integer.MAX_VALUE;
		for(int index = 0 ; index < height.length ; index++){
			if(smallestElem > height[index]){
				smallestElem = height[index];
			}
		}
		return smallestElem;
	}
	// method for find tallest height
	public static int findTallestHeight(int [] height){
		int lastestElem = Integer.MIN_VALUE;
		for(int index = 0 ; index < height.length ; index++){
			if(lastestElem < height[index]){
				lastestElem = height[index];
			}
		}
		return lastestElem;
	}
	public static void main(String [] args){
		
		int [] playerHeight = new int[11];
		for(int index = 0 ; index < playerHeight.length; index++){
			int height = (int)(Math.random() * 101) + 150;
			playerHeight[index] = height;
		}
		//calling method directly because it is static
		int sumOfHeight = findSumOfElement(playerHeight);
		double meanOfHeight = findMeanOfElement(playerHeight);
		int shortestHeight = findSmallestHeight(playerHeight);
		int tallestHeight = findTallestHeight(playerHeight);
		
		// display result
		System.out.println("smallest element = "+ shortestHeight+ 
						   ", mean element = " + meanOfHeight+
						   ", tallest height = " + tallestHeight+
						   ", sum of height = " + sumOfHeight);
		
	}
}