import java.util.Scanner;
// Create MultiDimensionalToSingleDimension class to convert 
//multi dimensional array to single dimensional array
public class MultiDimensionalToSingleDimension{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = input.nextInt();
		System.out.println("Enter the number of columns: ");
		int column = input.nextInt();
		int [][] Matrix = new int[row][column];
		int [] result = new int[row*column];
		int index = 0;
		for(int i = 0 ; i < row ; i++){
			for(int j = 0 ; j < column; j++){
				System.out.println("Enter the number: ");
				Matrix[i][j] = input.nextInt();
			}
		}
		// For loop for multi-dimensional array to single-dimensional
		for(int i = 0 ; i < row ; i++){
			for(int j = 0 ; j < column; j++){
				result[index++] = Matrix[i][j];
			}
		}
		
		//Display to result
		System.out.println("In single-dimensional array: ");
		for(int ind = 0 ; ind < index ;ind++){
			System.out.println(result[ind]);
		}	
		input.close();
	
	}
}