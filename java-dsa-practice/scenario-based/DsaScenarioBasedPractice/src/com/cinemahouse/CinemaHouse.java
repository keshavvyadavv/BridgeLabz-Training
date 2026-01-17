package com.cinemahouse;
//Create CinemaHouse 
class CinemaHouse {

    //bubblesort to arrange movie show times in ascending order
    public static void bubbleSort(int[] showTimes) {
        int n = showTimes.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (showTimes[j] > showTimes[j + 1]) {
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // movie showtimes (in minutes)
        int[] showTimes = {180, 120, 150, 210, 90};

        bubbleSort(showTimes);

        //print
        System.out.println("Sorted movie showtimes:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }
    }
}
