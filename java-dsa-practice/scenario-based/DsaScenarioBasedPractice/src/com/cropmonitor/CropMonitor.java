package com.cropmonitor;
//Create a class CropMonitor
class CropMonitor {

    //quicksort method
    public static void quickSort(long[] timestamps, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(timestamps, low, high);

            quickSort(timestamps, low, pivotIndex - 1);
            quickSort(timestamps, pivotIndex + 1, high);
        }
    }
    //partition method
    private static int partition(long[] timestamps, int low, int high) {
        long pivot = timestamps[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (timestamps[j] < pivot) {
                i++;
                long temp = timestamps[i];
                timestamps[i] = timestamps[j];
                timestamps[j] = temp;
            }
        }

        //place pivot at correct position
        long temp = timestamps[i + 1];
        timestamps[i + 1] = timestamps[high];
        timestamps[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        long[] sensorTimestamps = {
            1705200300, 1705200100, 1705200500, 1705200200
        };

        quickSort(sensorTimestamps, 0, sensorTimestamps.length - 1);

        System.out.println("Sorted sensor timestamps:");
        for (long t : sensorTimestamps) {
            System.out.print(t + " ");
        }
    }
}
