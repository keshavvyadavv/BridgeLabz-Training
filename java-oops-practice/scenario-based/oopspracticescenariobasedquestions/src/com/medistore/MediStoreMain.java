package com.medistore;
//create MediStoreMain to test
public class MediStoreMain {
    public static void main(String[] args) {

        //create medicines objects
    	Medicine tablet = new Tablet("Paracetamol", 10.5, "31-12-2025", 20);
    	Medicine syrup = new Syrup("Cough Syrup", 55, "10-10-2030", 10);
    	Medicine injection = new Injection("Vitamin B12", 120, "01-05-2026", 5);

        //sell some stock
        tablet.sell(5);
        syrup.sell(3);
        injection.sell(2);
        
        tablet.checkExpiry("01-01-2024");
        syrup.checkExpiry("02-02-2031");
        injection.checkExpiry("02-01-2026");
    }
}
