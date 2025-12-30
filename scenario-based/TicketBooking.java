//14. Movie Ticket Booking App 🎬
//Ask users for movie type, seat type (gold/silver), and snacks.
//● Use switch and if together.
//● Loop through multiple customers.
//● Clean structure and helpful variable names.

import java.util.Scanner;
public class TicketBooking {
    public static void main(String[] args) {

		//create scanner object
        Scanner input = new Scanner(System.in);
        String[] movies = {
                "Drama", "Comedy", "Action", "Horror",
                "Sci-Fi", "Romance", "Thriller", "Sports"
        };
        int[] silverMoviePrice = {800, 1000, 1300, 500, 700, 400, 900, 1100};
        int[] goldMoviePrice   = {1300, 1500, 1800, 1000, 1200, 900, 1400, 1600};
        String[] snacks = {"Popcorn", "Samosa", "Nachos", "French Fries"};
        int[] snacksPrice = {599, 199, 899, 999};
        char continueBooking = 'n';
        do {
            System.out.println("\n Movie Menu:");
            for (int i = 0; i < movies.length; i++) {
                System.out.println((i + 1) + ". " + movies[i]);
            }
            System.out.print("Select movie (1-8): ");
            int movieChoice = input.nextInt() - 1;
            System.out.println("\nSeat Type:");
            System.out.println("1. Gold");
            System.out.println("2. Silver");
            System.out.print("Choose seat type: ");
            int seatChoice = input.nextInt();
            int ticketPrice;
            //Usw switch + if
            switch (seatChoice) {
                case 1:
                    ticketPrice = goldMoviePrice[movieChoice];
                    break;
                case 2:
                    ticketPrice = silverMoviePrice[movieChoice];
                    break;
                default:
                    System.out.println("Invalid seat choice!");
                    continue;
            }
            int snacksTotal = 0;
            System.out.println("\nSnacks Menu:");
            for (int i = 0; i < snacks.length; i++) {
                System.out.println((i + 1) + ". " + snacks[i] + " - Rs. " + snacksPrice[i]);
            }
            System.out.print("Enter snack number (0 for none): ");
            int snackChoice = input.nextInt();
            if (snackChoice > 0 && snackChoice <= snacks.length) {
                snacksTotal = snacksPrice[snackChoice - 1];
            }
            int totalBill = ticketPrice + snacksTotal;
			
			//display answer.
            System.out.println("\n Booking Summary:");
            System.out.println("Movie: " + movies[movieChoice]);
            System.out.println("Ticket Price: Rs. " + ticketPrice);
            System.out.println("Snacks Price: Rs. " + snacksTotal);
            System.out.println("Total Bill: Rs. " + totalBill);
            System.out.print("\nBook another ticket? (y/n): ");
            continueBooking = input.next().charAt(0);
        } while (continueBooking == 'y' || continueBooking == 'Y');

        System.out.println("\nThank you for booking!");
        input.close();
    }
}
