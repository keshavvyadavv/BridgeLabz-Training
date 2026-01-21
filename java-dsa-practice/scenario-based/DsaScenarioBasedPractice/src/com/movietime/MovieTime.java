package com.movietime;
//create MovieTime class 
public class MovieTime {
	//Method insertionSort
    public static void insertionSort(Show[] shows) {
        for (int i = 1; i < shows.length; i++) {
            Show key = shows[i];
            int j = i - 1;

            while (j >= 0 && shows[j].time > key.time) {
                shows[j + 1] = shows[j];
                j--;
            }

            shows[j + 1] = key;
        }
    }

    public static void main(String[] args) {
    	
        Show[] shows = {
            new Show("Dangle", 1800),
            new Show("RRR", 1400),
            new Show("Interstellar", 1600),
            new Show("zero", 2000)
        };

        insertionSort(shows);

        System.out.println("Sorted Showtimes:");
        for (Show s : shows) {
            System.out.println(s);
        }
    }
}

