package battleship;

import java.util.Scanner;
import java.util.ArrayList;

public class Battleship {
    static Scanner Hello = new Scanner(System.in);
    static int x;
    static int y;
    static int x2;
    static int y2;
    int points = 0;
    static boolean isX;
    static int fireX;
    static int fireY;


    public static void main(String[] args) {
        Boba ship1 = new Boba(0, 0, 0, 0, 0);
        Boba ship2 = new Boba(0, 0, 0, 0, 0);

        System.out.println("Welcome to Battleship!\n" +
                "This game doesn't have a visual cue for the battleships, \n" +
                "so I highly recommend drawing it on a piece of paper.\n" +
                "The field goes from zero to nine.\n\n" +
                "Would you like to place your ships randomly or manually?");

        ArrayList<Integer> compareWithMe = new ArrayList<Integer>();

//        String randomVsManual = Hello.nextLine();

//        if (randomVsManual.equalsIgnoreCase("Randomly")) {
            System.out.println("Player 1");
<<<<<<< HEAD
            //ship1.randomizeShips();
            System.out.println("\nPlayer 2");
            //ship2.randomizeShips();
//        } else if (randomVsManual.equalsIgnoreCase("Manually")) {
//            ship1.randomizeShips();
//            ship2.manuallyPlaceShips();
//        } else {
//            System.out.println("Invalid response.");
//        }

//        while (ship1.points <= 17 || ship2.points <= 17) {
//            ship1.fire();
//            ship2.computerFire();
//        }
=======
            ship1.randomizeShips();
            System.out.println("Player 2");
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
>>>>>>> parent of 26be694... Depression
    }
}