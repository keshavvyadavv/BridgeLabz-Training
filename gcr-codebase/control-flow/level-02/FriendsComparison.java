// Create a FriendsComparison class to find youngest and tallest friends
import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {


        // Create Scanner object and taking input from the user
        Scanner input = new Scanner(System.in);
        // Taking ages as input
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();
        // Taking heights as input
        System.out.print("Enter height of Amar (in  cm): ");
        double heightAmar = input.nextDouble();
        System.out.print("Enter height of Akbar (in cm ): ");
        double heightAkbar = input.nextDouble();
        System.out.print("Enter height of Anthony ( in cm): ");
        double heightAnthony = input.nextDouble();
        // Find the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        // Find the tallest friend
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }


        // Display results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
        input.close();
    }
}
