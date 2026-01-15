package com.zipzipmart;
import java.util.List;
import java.util.ArrayList;

public class MartApp {
	
	//merge both the part 
	public static void mergeTransactions(Transaction [] allTransactions , int low , int mid , int high) {
		int i = low;
		int j = mid + 1;
		List<Transaction> temp = new ArrayList<>();
		
		while(i <= mid && j <= high) {
			
			int dateCompare = allTransactions[i].getDate().compareTo(allTransactions[j].getDate());
			if(dateCompare < 0 || 
			   (dateCompare == 0 && allTransactions[i].getAmount() <= allTransactions[j].getAmount())) {
				temp.add(allTransactions[i++]);
			}else {
				temp.add(allTransactions[j++]);
			}
		}
		
		while(i <= mid) {
			temp.add(allTransactions[i++]);
		}
		while(j <= high) {
			temp.add(allTransactions[j++]);
		}
		int count = low;
		
		for(Transaction num : temp) {
			allTransactions[count++] = num;
		}
	}

	public static void mergeSortTransaction(Transaction [] allTransactions, int low , int high) {
		if(low < high) {
			int mid = (low + high)/2;
			//divided into two parts 
			mergeSortTransaction(allTransactions , low , mid);
			mergeSortTransaction(allTransactions , mid + 1 , high);
			//merge them
			mergeTransactions(allTransactions , low , mid , high);
		}
	}
	
	public static void main(String[] args) {
		//create array of transaction
		Transaction [] allTransactions = {
				new Transaction("2027-01-11", 3000),
	            new Transaction("2027-01-13", 500),
	            new Transaction("2027-01-02", 8000),
	            new Transaction("2027-01-10", 31000),
	            new Transaction("2027-01-19", 4500),
	            new Transaction("2027-01-21", 94000)
		};
		System.out.println("Daily Sales Report (Sorted):");
		mergeSortTransaction(allTransactions, 0, allTransactions.length - 1);

		//display the transactions
        for (Transaction t : allTransactions) {
            System.out.println(t);
        }
		
	}
}
