import java.util.Scanner;

public class Battleship {
    static Scanner Hello = new Scanner(System.in);
    static int x;
    static int y;
    static int x2;
    static int y2;
    static int points;
    static String randomVsManual;
    static boolean xOrY;

    public static void main(String args[]) {
        Boba ship1 = new Boba(6, 2, 6, 5, 0);
        Boba ship2 = new Boba(5, 3, 8, 3, 0);

        System.out.println("Would you like to place your ships randomly or manually?");
        randomVsManual = Hello.nextLine();

        if (randomVsManual == "Randomly") {
            Boba.randomizeShips();
        } else if (randomVsManual == "Manually") {
            Boba.manuallyPlaceShips();
        } else {
            System.out.println("Invalid response.");
        }

        while (points <= 3) {
            ship1.fire();
            ship2.fire();
        }
    }
}