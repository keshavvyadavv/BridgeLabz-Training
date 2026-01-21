package com.medwarehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//create a class MedWarehouseMain 
public class MedWarehouseMain {

    //Merge sort
    public static void mergeSort(List<Medicine> list) {
        if (list.size() <= 1)
            return;

        int mid = list.size() / 2;

        List<Medicine> left = new ArrayList<>(list.subList(0, mid));
        List<Medicine> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list, left, right);
    }

    //Merge two sorted lists
    private static void merge(List<Medicine> list,List<Medicine> left,List<Medicine> right) {
    	
        int i = 0, j = 0, k = 0;
        
        while (i < left.size() && j < right.size()) {
            if (left.get(i).expiryDate <= right.get(j).expiryDate) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        
        while (i < left.size())
            list.set(k++, left.get(i++));

        while (j < right.size())
            list.set(k++, right.get(j++));
    }

    //alert for near expiry medicines
    public static void checkNearExpiry(List<Medicine> medicines, int today, int threshold) {
        System.out.println("\nmedicines Near Expiry:");
        for (Medicine m : medicines) {
            if (m.expiryDate - today <= threshold) {
                System.out.println(m);
            }
        }
    }

    public static void main(String[] args) {

        //branch-wise sorted lists
        List<Medicine> branch1 = Arrays.asList(new Medicine("Paracetamol", 20260210),new Medicine("amoxicillin", 20260315));

        List<Medicine> branch2 = Arrays.asList(new Medicine("ibuprofen", 20260130),new Medicine(" cough Syrup", 20260420));

        // combine all branches
        List<Medicine> warehouse = new ArrayList<>();
        warehouse.addAll(branch1);
        warehouse.addAll(branch2);

        //  sort by expiry
        mergeSort(warehouse);

        System.out.println("Medicines Sorted by Expiry:");
        for (Medicine m : warehouse) {
            System.out.println(m);
        }

        //   check near expiry 
        int today = 20260101;
        int threshold = 30;
        checkNearExpiry(warehouse, today, threshold);
    }
}
