package com.artexpo;

public class ArtExpo {

    //method for insertion Sort based on registrationTime
    public static void insertionSort(Artist[] artists) {
        for (int i = 1; i < artists.length; i++) {
            Artist key = artists[i];
            int j = i - 1;
            //shift artists who registered later
            while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
                artists[j + 1] = artists[j];
                j--;
            }
            artists[j + 1] = key;
        }
    }

    public static void main(String[] args) {
    	
        Artist[] artists = {new Artist("abc", 1050),new Artist("bbb", 1010),new Artist("ccc", 1030),new Artist("ddd", 1020)};
        insertionSort(artists);

        //print the artists by registration time
        System.out.println("Artists sorted by registration time:");
        for (Artist a : artists) {
            System.out.println(a.name + " - " + a.registrationTime);
        }
    }
}
