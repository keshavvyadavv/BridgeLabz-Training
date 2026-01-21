package com.movietime;
//Create show class having information about movieName and time
class Show {
    String movieName;
    int time; 

    public Show(String movieName, int time) {
        this.movieName = movieName;
        this.time = time;
    }

    @Override
    public String toString() {
        return movieName + " at " + time;
    }
}