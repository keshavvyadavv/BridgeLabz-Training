package com.foodfest;
//Create FoodFest Class that 
public class FoodFest {

    public static void mergeSort(Stall[] stalls, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(stalls, left, mid);
            mergeSort(stalls, mid + 1, right);
            merge(stalls, left, mid, right);
        }
    }

    private static void merge(Stall[] stalls, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Stall[] leftArray = new Stall[n1];
        Stall[] rightArray = new Stall[n2];

        for (int i = 0; i < n1; i++)
        	leftArray[i] = stalls[left + i];
        for (int j = 0; j < n2; j++)
        	rightArray[j] = stalls[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable merge
        while (i < n1 && j < n2) {
            if (leftArray[i].footfall <= rightArray[j].footfall) {
                stalls[k++] = leftArray[i++];
            } else {
                stalls[k++] = rightArray[j++];
            }
        }

        while (i < n1)
            stalls[k++] = leftArray[i++];

        while (j < n2)
            stalls[k++] = rightArray[j++];
    }

    public static void main(String[] args) {
        Stall[] stalls = {
            new Stall("Burger Hub", 120),
            new Stall("Pizza Point", 200),
            new Stall("Taco Town", 200),
            new Stall("Ice Cream", 90),
            new Stall("Noodles", 150)
        };

        mergeSort(stalls, 0, stalls.length - 1);

        System.out.println("Sorted Stalls by Footfall:");
        for (Stall s : stalls) {
            System.out.println(s);
        }
    }
}
