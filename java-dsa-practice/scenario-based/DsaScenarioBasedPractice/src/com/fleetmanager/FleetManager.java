package com.fleetmanager;

public class FleetManager {

    public static void mergeSort(Vehicle[] vehicles, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            
            mergeSort(vehicles, left, mid);
            mergeSort(vehicles, mid + 1, right);
            merge(vehicles, left, mid, right);
        }
    }

    //merge two sorted halves
    private static void merge(Vehicle[] vehicles, int left, int mid, int right) {
    	
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] leftVehicle = new Vehicle[n1];
        Vehicle[] rightVehicle = new Vehicle[n2];

        for (int i = 0; i < n1; i++)
        	leftVehicle[i] = vehicles[left + i];
        for (int j = 0; j < n2; j++)
        	rightVehicle[j] = vehicles[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftVehicle[i].mileage <= rightVehicle[j].mileage) {
                vehicles[k++] = leftVehicle[i++];
            } else {
                vehicles[k++] = rightVehicle[j++];
            }
        }

        while (i < n1)
            vehicles[k++] = leftVehicle[i++];

        while (j < n2)
            vehicles[k++] = rightVehicle[j++];
    }

    public static void main(String[] args) {

        // Combined sorted lists from depots
        Vehicle[] masterSchedule = {
            new Vehicle("MP101", 100),
            new Vehicle("MP102", 18000),
            new Vehicle("MP201", 15000),
            new Vehicle("MP202", 22000),
            new Vehicle("MP301", 13000)
        };

        mergeSort(masterSchedule, 0, masterSchedule.length - 1);

        System.out.println("Master Maintenance Schedule (by mileage):");
        for (Vehicle v : masterSchedule) {
            System.out.println(v.vehicleId + " - " + v.mileage);
        }
    }
}
