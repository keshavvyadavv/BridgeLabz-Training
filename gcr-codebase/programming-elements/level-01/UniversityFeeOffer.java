// Create UniversityFeeOffer Class to compute offer by university on fee to student
public class UniversityFeeOffer{
	public static void main(String[] args){
		// Create variable fee for actual fee
		int fee = 125000;
		// Create variable discountPercent for discount percent given by university
		int discountPercent = 10;
		
		// Create discountAmount for calculating the discount amount
		double discountAmount = (double)(125000/10);
		
		// Create finalFee for calculating the final amount
		double finalFee = (double)fee - discountAmount;
		
		// Print the discount amount and final fee
		System.out.println("The discount amount is INR " +discountAmount+ " and final discounted fee is INR " +finalFee);
	}

}