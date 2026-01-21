package com.gamerzone;
//Create GamerZone sort the 
public class GamerZone {

    public static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(Player[] players, int low, int high) {
        int pivot = players[high].score;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players[j].score >= pivot) {
                i++;
                swap(players, i, j);
            }
        }
        swap(players, i + 1, high);
        return i + 1;
    }

    private static void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("abhi", 1500),
            new Player("Riya", 3200),
            new Player("Sam", 2800),
            new Player("kesh", 11800),
            new Player("Neha", 3200)
        };

        quickSort(players, 0, players.length - 1);

        System.out.println("gamerZone Leaderboard  :");
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
