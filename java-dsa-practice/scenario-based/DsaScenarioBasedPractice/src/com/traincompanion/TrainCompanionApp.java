package com.traincompanion;


public class TrainCompanionApp {
	public static void main(String[] args) {
		
		//create the object of train
	   TrainCompanion train = new TrainCompanion();
	
	   train.addCompartment(1, "General");
	   train.addCompartment(2, "Sleeper");
	   train.addCompartment(3, "Pantry");
	   train.addCompartment(4, "WiFi");
	
	   train.traverseForward();
	   train.traverseBackward();
	
	   train.showAdjacent(3);
	
	   train.removeCompartment(2);
	   train.traverseForward();
	}
}

