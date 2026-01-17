package com.robowarehouse;

class RoboWarehouse {

    //Method to perform insertion sort based on package weight
    public static void insertionSort(int[] weights) {
        int n = weights.length;
        for (int i = 1; i < n; i++) {
            int currentPackage = weights[i];
            int j = i - 1;
            while (j >= 0 && weights[j] > currentPackage) {
                weights[j + 1] = weights[j];
                j--;
            }
            weights[j + 1] = currentPackage;
        }
    }

    public static void main(String[] args) {
        //shelf with package weights
        int[] packageWeights = {40, 10, 30, 20, 50};
        insertionSort(packageWeights);
        
        System.out.println("sorted shelf by weight:");
        for (int weight : packageWeights) {
            System.out.print(weight + " ");
        }
    }
}
