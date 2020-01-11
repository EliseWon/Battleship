import java.util.Scanner;

public class Battleship {
    static Scanner Hello = new Scanner(System.in);
    static int x;
    static int y;
    static int x2;
    static int y2;
    static int gudetama1;
    static int gudetama2;
    static int gudetama3;
    static int gudetama4;
    static int points;

    public static void main(String args[]) {
        Boba ship1 = new Boba(6, 2, 6, 5, 0);
        Boba ship2 = new Boba(5, 3, 8, 3, 0);

        System.out.println("Would you like to place your ships randomly or manually?");
        String randomVsManual = Hello.nextLine();

        switch(randomVsmanual) {
            case "Random":
                Boba.randomizeShips();
            case "Manually":
                Boba.manuallyPlaceShips();
            default:
                System.out.println("Invalid response.");
        }

        while (points <= 3) {
            ship1.fire();
            ship2.fire();
        }
    }
}