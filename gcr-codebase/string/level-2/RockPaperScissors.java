import java.util.Scanner;
public class RockPaperScissors {
    //method to get computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }
    //to find winner
    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }
    //method to calculate stats and percentages
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;
        String[][] stats = {
            {"Player", "Wins", "Win %"},
            {"User", String.valueOf(userWins), String.format("%.2f", userPercentage)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f", computerPercentage)}
        };
        return stats;
    }
    //method that display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }
        System.out.println("\nStatistics:");
        for (String[] row : stats) {
            System.out.printf("%-10s %-10s %-10s%n", row[0], row[1], row[2]);
        }
    }
    public static void main(String[] args) {
		
		//create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = input.nextInt();
        String[][] gameResults = new String[games][3];
        int userWins = 0;
        int computerWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("\nGame " + (i + 1) + " - enter your choice (Rock/Paper/ Scissors): ");
            String userChoice = input.next();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }
        String[][] stats = calculateStats(userWins, computerWins, games);
		
		//print result
        displayResults(gameResults, stats);
        input.close();
    }
}
