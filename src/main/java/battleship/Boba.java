package battleship;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.Random;

public class Boba extends Battleship {

<<<<<<< HEAD
<<<<<<< HEAD
    int[][] theBoard = new int[][] { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,}};
=======
    private static int[] shipLengths = {2, 3, 3, 4, 5};
>>>>>>> parent of 26be694... Depression
=======
    private static int[] shipLengths = {2, 3, 3, 4, 5};
>>>>>>> parent of 26be694... Depression

    Boba(int startX, int startY, int endX, int endY, int initialPoints) {
        x = startX;
        y = startY;
        x2 = endX;
        y2 = endY;
        points = initialPoints;
    }

<<<<<<< HEAD
//comment extracted here
=======
    void randomizeShips() {

        int[][] theBoard = new int[10][10];


        for (int i = 0; i < shipLengths.length; i++) {
            int z = (int) Array.get(shipLengths, i);
            int[] randomizedShipCoordinates = makeShip(z);

            x = (int) Array.get(randomizedShipCoordinates, 0);
            y = (int) Array.get(randomizedShipCoordinates, 1);
            x2 = (int) Array.get(randomizedShipCoordinates, 2);
            y2 = (int) Array.get(randomizedShipCoordinates, 3);

            while (x2 > 9 || y2 > 9) {
                randomizedShipCoordinates = makeShip(z);
                x = (int) Array.get(randomizedShipCoordinates, 0);
                y = (int) Array.get(randomizedShipCoordinates, 1);
                x2 = (int) Array.get(randomizedShipCoordinates, 2);
                y2 = (int) Array.get(randomizedShipCoordinates, 3);
            }

            for (int m = 0; m < theBoard.length; m++) {
                for (int n = 0; n < theBoard[0].length; n++) {
                    while (theBoard[x][y] == 1) {
                        randomizedShipCoordinates =  makeShip(z);
                        x = (int) Array.get(randomizedShipCoordinates, 0);
                        y = (int) Array.get(randomizedShipCoordinates, 1);
                        x2 = (int) Array.get(randomizedShipCoordinates, 2);
                        y2 = (int) Array.get(randomizedShipCoordinates, 3);
                    }
                    for (int a = x; x < x2; x++) {
                        for (int b = y; y < y2; y++) {
                            theBoard[a][b] = 1;
                        }
                    }
                }
            }
            System.out.println("Start: " + x + ", " + y);
            System.out.println("End:" + x2 + ", " + y2);
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
            System.out.println("Would you like to place your ship horizontally or vertically?");
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
>>>>>>> parent of 26be694... Depression

    @NotNull
    @Contract("_ -> new")
    int[] makeShip(int z) {
        Random randomizer = new Random();
        int x2;
        int y2;

        int x = randomizer.nextInt(10);
        int y = randomizer.nextInt(10);
        isX = randomizer.nextBoolean();

        if (isX) {
            x2 = x;
            y2 = y + z;

        } else {
            y2 = y;
            x2 = x + z;
        }

        return new int[] {x, y, x2, y2};
    }

<<<<<<< HEAD
<<<<<<< HEAD
    @NotNull
    @Contract("_ -> new")
    int[] makeShip2(int z) {
        String direction;
        int xEnd = 0;
        int yEnd = 0;

        System.out.println("Where do you want to place your ship?\n" +
                "Insert your starting x point.\n" +
                "Please list the left-most point.");
        int xStart = Hello.nextInt();
        System.out.println("Insert your starting y point.\n" +
                "Please list the top-most point.");
        int yStart = Hello.nextInt();
        System.out.println("Would you like to place your ship horizontally or vertically?");
        direction = Hello.nextLine();

        if (direction.equalsIgnoreCase("Horizontal")) {
            xEnd = xStart + z;
            yEnd = yStart;
        } else if (direction.equalsIgnoreCase("Vertical")) {
            yEnd = yStart + z;
            xEnd = xStart;
        } else {
            System.out.println("Not a valid direction.");
        }

        return new int[] {xStart, yStart, xEnd, yEnd};
    }

    void fire() {
        fireValidEntry();
        fireX = (int) Array.get(fireValidEntry(), 0);
        fireY = (int) Array.get(fireValidEntry(), 1);
=======
    void fire() {
        System.out.println("Where would you like to fire?\nEnter the x value:");
            int fireX = Hello.nextInt();
            System.out.println("Error: Not an integer.");
>>>>>>> parent of 26be694... Depression
=======
    void fire() {
        System.out.println("Where would you like to fire?\nEnter the x value:");
            int fireX = Hello.nextInt();
            System.out.println("Error: Not an integer.");
>>>>>>> parent of 26be694... Depression


        System.out.println("Enter the y value:");
            int fireY = Hello.nextInt();
            System.out.println("Error: Not an integer.");

        if (fireX < 1 || fireX > 10) {
            System.out.println("Invalid entry.");
        } else {
            if (fireY < 1 || fireY > 10) {
                System.out.println("Invalid entry.");
            } else {
                if (fireX >= x && fireX <= x2) {
                    if (fireY >= y && fireY <= y2) {
                        System.out.println("Hit");
                        points++;
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
        fireX = randomizer2.nextInt(10);
        fireY = randomizer2.nextInt(10);

        if (fireX >= x && fireX <= x2) {
            if (fireY >= y && fireY <= y2) {
                System.out.println("Hit");
                points++;
            } else {
                System.out.println("Miss");
            }
        } else {
            System.out.println("Miss");
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD

    @NotNull
    @Contract(" -> new")
    private int[] fireValidEntry() {
        int fireX;
        int fireY;

        System.out.println("Where would you like to fire?\nEnter the x value:");
        try {
            fireX = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
            fireX = -1;
        }

        System.out.println("Enter the y value:");
        try {
            fireY = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
            fireY = -1;
        }
        return new int[] {fireX, fireY};
    }
=======
>>>>>>> parent of 26be694... Depression
=======
>>>>>>> parent of 26be694... Depression
}