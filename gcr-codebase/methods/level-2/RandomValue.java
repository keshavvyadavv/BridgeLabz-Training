// create a RandomValue class that find average , min, and max 
//of random number
public class RandomValue{
	//get 4 digit randon array
	public int[] generate4DigitRandomArray(int size){
		int[] result = new int[size];
		for(int index = 0 ; index < size;index++){
			result[index] = (int)((Math.random()*9000)+1000);
		}
		return result;
	}
	// get average, minimum, and maximum number
	public double[] findAverageMinMax(int[] numbers){
		double [] result = new double[3];
		double sum = numbers[0];
		double min = numbers[0];
		double max = numbers[0];
		for(int index = 1 ; index<numbers.length ; index++){
			sum += numbers[index];
			min = Math.min(min,numbers[index]);
			max = Math.max(max,numbers[index]);
		}
		result[0] = (double)sum/numbers.length;
		result[1] = min;
		result[2] = max;
		return result;		
	}
	public static void main(String[] args){
	
		// create RandomValue object
		RandomValue randomObj = new RandomValue();
		int [] digitArray = randomObj.generate4DigitRandomArray(5);
		double [] result = randomObj.findAverageMinMax(digitArray);
		
		System.out.println("Average: "+result[0]+ " Minimum: "+result[1]
							+ " Maximum: " + result[2]);

	}
}