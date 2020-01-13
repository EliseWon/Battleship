import java.util.Scanner;

public class Battleship {
    static Scanner Hello = new Scanner(System.in);
    static int x;
    static int y;
    static int x2;
    static int y2;
    static int points = 0;
    static String randomVsManual;
    static boolean xOrY;
    static int bye1;
    static int bye2;
    static int pearls;

    public static void main(String args[]) {
        Boba ship1 = new Boba(6, 2, 6, 5, 0);
        Boba ship2 = new Boba(5, 3, 8, 3, 0);

        System.out.println("Welcome to Battleship!\n" +
                "This interface doesn't have a visual cue for the battleships, \n" +
                "so I highly recommend drawing it on a piece of paper.\n" +
                "The field goes from zero to nine.\n\n" +
                "Would you like to place your ships randomly or manually?");
        randomVsManual = Hello.nextLine();

        if (randomVsManual.equalsIgnoreCase("Randomly")) {
            ship1.randomizeShips();
            ship2.randomizeShips();
        } else if (randomVsManual.equalsIgnoreCase("Manually")) {
            ship1.randomizeShips();
            ship2.manuallyPlaceShips();
        } else {
            System.out.println("Invalid response.");
        }

        while (ship1.points <= 17 || ship2.points <= 17) {
            ship1.fire();
            ship2.computerFire();
        }
    }
}