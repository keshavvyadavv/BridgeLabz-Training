package com.callcenter;
import java.util.*;

class CallCenter {

    // for normal customer queue 
    private Queue<Customer> normalQueue = new LinkedList<>();
    // priority queue for VIP customer  
    private PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a, b) -> a.customerId.compareTo(b.customerId));
    // Tracks number of calls per customer
    private HashMap<String, Integer> callCountMap = new HashMap<>();

    //Add incoming call
    public void receiveCall(Customer customer) {
        //update call count
        callCountMap.put(
                customer.customerId,
                callCountMap.getOrDefault(customer.customerId, 0) + 1
        );
        //add to appropriate queue
        if (customer.isVIP) {
            vipQueue.add(customer);
            System.out.println("VIP Call Received: " + customer);
        } else {
            normalQueue.add(customer);
            System.out.println("Normal Call Received: " + customer);
        }
    }

    //process next call
    public void processCall() {
        Customer customer;
        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("Processing VIP customer: " + customer);
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
            System.out.println("Processing normal customer: " + customer);
        } else {
            System.out.println("No calls to process.");
            return;
        }
    }

    // show call statistics
    public void showCallStatistics() {
        System.out.println("\n Monthly Call Count:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey()
                    + " → Calls: " + entry.getValue());
        }
    }
}
