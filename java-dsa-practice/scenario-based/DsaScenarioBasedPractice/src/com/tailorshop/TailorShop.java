package com.tailorshop;
//create TailorShop 
public class TailorShop {

    public static void insertionSort(Order[] orders) {
        for (int i = 1; i < orders.length; i++) {
            Order key = orders[i];
            int j = i - 1;
            while (j >= 0 && orders[j].deadline > key.deadline) {
                orders[j + 1] = orders[j];
                j--;
            }
            orders[j + 1] = key;
        }
    }

    public static void main(String[] args) {
    	
        Order[] orders = {
            new Order(101, 5),
            new Order(102, 2),
            new Order(103, 8),
            new Order(104, 1),
            new Order(105, 4)
        };
        insertionSort(orders);

        System.out.println("Sorted Orders by Delivery Deadline:");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
