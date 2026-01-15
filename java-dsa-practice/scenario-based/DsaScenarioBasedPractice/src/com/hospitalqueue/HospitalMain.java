package com.hospitalqueue;

//create a HospitalMain class that sort and display
public class HospitalMain {
	
	public static void sortByLocality(Patient [] queue) {
		//sort on the bases of criticality level 
		for(int i = 0 ; i < queue.length ; i++) {
			boolean swapped = true;
			for(int j = 0 ; j < queue.length - i - 1; j++) {
				if(queue[j].criticality < queue[j+1].criticality) {
					swapped = false;
					Patient temp = queue[j+1];
					queue[j+1] = queue[j];
					queue[j] = temp;
				}
			}
			if(swapped) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		//data of patients
		Patient [] queue = {
				new Patient("a",4),
				new Patient("b",1),
				new Patient("c",7),
				new Patient("d",2),
				new Patient("e",8),
				new Patient("f",2),
				new Patient("g",10),
				new Patient("h",6),
				new Patient("i",8),
				};
		System.out.println("Before sorting");
		for(Patient p : queue) {
			p.display();
		}
		sortByLocality(queue);
		
		System.out.println("after sorting");
		for(Patient p : queue) {
			p.display();
		}
	}
}	
