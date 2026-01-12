package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {
	
    private Vehicle head = null;
    private Vehicle tail = null;

    private Queue<String> waitingQueue = new LinkedList<>();
    private int queueCapacity = 5;

    // add vehicle to waiting queue
    public void enqueueVehicle(String vehicleNumber) {
        if (waitingQueue.size() == queueCapacity) {
            System.out.println("Queue Overflow! Vehicle " + vehicleNumber + " cannot enter.");
            return;
        }
        waitingQueue.offer(vehicleNumber);
        System.out.println("Vehicle " + vehicleNumber + " added to waiting queue.");
    }

    //move vehicle from queue to roundabout
    public void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicle waiting.");
            return;
        }

        String vehicleNumber = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(vehicleNumber);

        if (head == null) {
            head = tail = newVehicle;
            tail.next = head;
        } else {
            tail.next = newVehicle;
            tail = newVehicle;
            tail.next = head;
        }
        System.out.println("Vehicle " + vehicleNumber + " entered the roundabout.");
    }

    //remove vehicle from roundabout
    public void exitRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty!");
            return;
        }

        System.out.println("Vehicle " + head.number + " exited the roundabout.");

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    //print roundabout state
    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print("Roundabout Vehicles: ");
        Vehicle temp = head;
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Start)");
    }

    //print waiting queue
    public void printWaitingQueue() {
        System.out.println("Waiting Queue: " + waitingQueue);
    }
}
