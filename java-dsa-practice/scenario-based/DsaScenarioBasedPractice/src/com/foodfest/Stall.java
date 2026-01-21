package com.foodfest;
//create a Stall class 
class Stall {
    String stallName;
    int footfall;
    //contructor
    public Stall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    @Override
    public String toString() {
        return stallName + " : " + footfall;
    }
}
