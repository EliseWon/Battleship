package battleship;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.lang.reflect.Array;

public class Boba extends Battleship {

    private static int[] shipLengths = {2, 3, 3, 4, 5};

    Boba(int startX, int startY, int endX, int endY, int initialPoints) {
        x = startX;
        y = startY;
        x2 = endX;
        y2 = endY;
        points = initialPoints;
    }

    void randomizeShips() {

        int[][] theBoard = new int[10][10];
        //public static String [][] grid = new String [numRows][numColumns];
        //public static int numRows = 10;
        //public static int numColumns = 10;

        for (int i = 0; i < shipLengths.length; i++) {
            int z = (int) Array.get(shipLengths, i);

            makeShip(z);
            int[] randomizedShipCoordinates = makeShip(z);
            x = (int) Array.get(randomizedShipCoordinates, 0);
            y = (int) Array.get(randomizedShipCoordinates, 1);
            x2 = (int) Array.get(randomizedShipCoordinates, 2);
            y2 = (int) Array.get(randomizedShipCoordinates, 3);

            while (x2 > 9 || y2 > 9) {
                makeShip(z);
                x = (int) Array.get(randomizedShipCoordinates, 0);
                y = (int) Array.get(randomizedShipCoordinates, 1);
                x2 = (int) Array.get(randomizedShipCoordinates, 2);
                y2 = (int) Array.get(randomizedShipCoordinates, 3);
            }

            for (int m = 0; m < theBoard.length; m++) {
                for (int n = 0; n < theBoard[0].length; n++) {
                    while (theBoard[x][y] == 1) {
                        makeShip(z);
                        x = (int) Array.get(randomizedShipCoordinates, 0);
                        y = (int) Array.get(randomizedShipCoordinates, 1);
                        x2 = (int) Array.get(randomizedShipCoordinates, 2);
                        y2 = (int) Array.get(randomizedShipCoordinates, 3);
                    }
                    int asDf = 4;
                    for (int a = x; x < x2; x++) {
                        for (int b = y; y < y2; y++) {
                            theBoard[a][b] = 1;
                        }
                    }
                }
            }

            System.out.println(x + ", " + y);

        }
    }

    void manuallyPlaceShips() {
        String direction;

        for (int i = 0; i < 5; i++) {
            System.out.println("Where do you want to place your ships?\n" +
                    "Insert your starting x point.\n" +
                    "Please list the left-most point.");
            x = Hello.nextInt();
            System.out.println("Insert your starting y point.\n" +
                    "Please list the top-most point.");
            y = Hello.nextInt();
            System.out.println("Horizontal or vertical?");
            direction = Hello.nextLine();

            if (direction.equalsIgnoreCase("Horizontal")) {
                x2 = x + (int) Array.get(shipLengths, i);
                y2 = y;
            } else if (direction.equalsIgnoreCase("Vertical")) {
                y2 = y + (int) Array.get(shipLengths, i);
                x2 = x;
            } else {
                System.out.println("Not a valid direction.");
            }
        }
    }

    @NotNull
    @Contract("_ -> new")
    private int[] makeShip(int z) {
        Random randomizer = new Random();
        int xEnd;
        int yEnd;

        int xStart = randomizer.nextInt(10);
        int yStart = randomizer.nextInt(10);
        xOrY = randomizer.nextBoolean();

        if (xOrY) {
            xEnd = xStart;
            yEnd = yStart + z;

        } else {
            yEnd = yStart;
            xEnd = xStart + z;
        }

        return new int[]{xStart, yStart, xEnd, yEnd};

    }

    void fire() {
        System.out.println("Where would you like to fire?\nInsert your x value:");
        try {
            int bye1 = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
        }

        System.out.println("Insert your y value:");
        try {
            int bye2 = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
        }

        if (bye1 < 1 || bye1 > 10) {
            System.out.println("Invalid entry.");
        } else {
            if (bye2 < 1 || bye2 > 10) {
                System.out.println("Invalid entry.");
            } else {
                if (bye1 >= x && bye1 <= x2) {
                    if (bye2 >= y && bye2 <= y2) {
                        System.out.println("Hit");
                        points = points + 1;
                    } else {
                        System.out.println("Miss");
                    }
                } else {
                    System.out.println("Miss");
                }
            }
        }
    }

    void computerFire() {
        Random randomizer2 = new Random();
        bye1 = randomizer2.nextInt(10);
        bye2 = randomizer2.nextInt(10);

        if (bye1 >= x && bye1 <= x2) {
            if (bye2 >= y && bye2 <= y2) {
                System.out.println("Hit");
                points = points + 1;
            } else {
                System.out.println("Miss");
            }
        } else {
            System.out.println("Miss");
        }
    }
}