package com.traincompanion;

//create doubly Linked List for Train Companion System
class TrainCompanion {
		
	private Compartment head;
	private Compartment tail;
	
	//add compartment at end
	public void addCompartment(int number, String service) {
	   Compartment newCompartment = new Compartment(number, service);
	
	   if (head == null) {
	       head = tail = newCompartment;
	   } else {
	       tail.next = newCompartment;
	       newCompartment.prev = tail;
	       tail = newCompartment;
	   }
	   System.out.println("Compartment " + number + " added.");
	}
	
	//remove a compartment by number
	public void removeCompartment(int number) {
		
	   Compartment temp = head;
	
	   while (temp != null) {
	       if (temp.number == number) {
	           if (temp == head) {
	               head = head.next;
	               if (head != null)
	                   head.prev = null;
	           } 
	           else if (temp == tail) {
	               tail = tail.prev;
	               tail.next = null;
	           } 
	           else {
	               temp.prev.next = temp.next;
	               temp.next.prev = temp.prev;
	           }
	           System.out.println("Compartment " + number + " removed.");
	           return;
	       }
	       temp = temp.next;
	   }
	   System.out.println("Compartment not found.");
	}
	
	//traverse forward
	public void traverseForward() {
	   Compartment temp = head;
	   System.out.println("\nForward Traversal:");
	   while (temp != null) {
	       System.out.println("Compartment " + temp.number + " - " + temp.service);
	       temp = temp.next;
	   }
	}
	
	//traverse backward
	public void traverseBackward() {
	   Compartment temp = tail;
	   System.out.println("\nBackward Traversal:");
	   while (temp != null) {
	       System.out.println("Compartment " + temp.number + " - " + temp.service);
	       temp = temp.prev;
	   }
	}
	
	// display adjacent compartments
	public void showAdjacent(int number) {
	   Compartment temp = head;
	
	   while (temp != null) {
	       if (temp.number == number) {
	           System.out.println("\nCurrent Compartment: " + temp.number);
	           if (temp.prev != null) {
	        	   System.out.println("Previous: Compartment " + temp.prev.number);	        	   
	           }
	           else {
	        	   System.out.println("Previous: None");	        	   
	           }
	
	           if (temp.next != null) {
	        	   System.out.println("Next: Compartment " + temp.next.number);	        	   
	           }
	           else {
	        	   System.out.println("Next: None");	        	   
	           }
	           return;
	       }
	       temp = temp.next;
	   }
	   System.out.println("Compartment not found.");
	}
}
