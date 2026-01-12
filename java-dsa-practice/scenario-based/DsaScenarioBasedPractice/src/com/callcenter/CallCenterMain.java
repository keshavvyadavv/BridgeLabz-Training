package com.callcenter;

public class CallCenterMain {
    public static void main(String[] args) {

    	//create object of callcenter
        CallCenter callCenter = new CallCenter();
        
        //creating object of customer
        Customer c1 = new Customer("C101", "Ravi", false);
        Customer c2 = new Customer("C102", "Anita", true);
        Customer c3 = new Customer("C103", "Suresh", false);
        Customer c4 = new Customer("C102", "Anita", true);

        callCenter.receiveCall(c1);
        callCenter.receiveCall(c2);
        callCenter.receiveCall(c3);
        callCenter.receiveCall(c4);

        callCenter.processCall();
        callCenter.processCall();
        callCenter.processCall();

        callCenter.showCallStatistics();
    }
}
