package battleship;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.lang.reflect.Array;

public class Boba extends Battleship {

    private static int[] shipLengths = {1, 2, 2, 3, 4};
    private int[][] theBoard = new int[10][10];

    Boba(int startX, int startY, int endX, int endY, int initialPoints) {
        x = startX;
        y = startY;
        x2 = endX;
        y2 = endY;
        points = initialPoints;
    }

    void randomizeShips() {

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
                    while (theBoard[m][n] == theBoard[x][y] && theBoard[x][y] == 1) {
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

        for (int i = 0; i < 5; i++) {
            int z = (int) Array.get(shipLengths, i);
            int[] manualShipCoordinates = makeShip2(z);
            x = (int) Array.get(manualShipCoordinates, 0);
            y = (int) Array.get(manualShipCoordinates, 1);
            x2 = (int) Array.get(manualShipCoordinates, 2);
            y2 = (int) Array.get(manualShipCoordinates, 3);

            while (x2 > 9 || y2 > 9) {
                manualShipCoordinates = makeShip(z);
                x = (int) Array.get(manualShipCoordinates, 0);
                y = (int) Array.get(manualShipCoordinates, 1);
                x2 = (int) Array.get(manualShipCoordinates, 2);
                y2 = (int) Array.get(manualShipCoordinates, 3);
            }

            for (int m = 0; m < theBoard.length; m++) {
                for (int n = 0; n < theBoard[0].length; n++) {
                    while (theBoard[m][n] == theBoard[x][y] && theBoard[x][y] == 1) {
                        makeShip2(z);
                        manualShipCoordinates = makeShip2(z);
                        x = (int) Array.get(manualShipCoordinates, 0);
                        y = (int) Array.get(manualShipCoordinates, 1);
                        x2 = (int) Array.get(manualShipCoordinates, 2);
                        y2 = (int) Array.get(manualShipCoordinates, 3);
                    }
                    for (int a = x; x < x2; x++) {
                        for (int b = y; y < y2; y++) {
                            theBoard[a][b] = 1;
                        }
                    }
                }
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

        return new int[] {xStart, yStart, xEnd, yEnd};
    }

    @NotNull
    @Contract("_ -> new")
    private int[] makeShip2(int z) {
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
        int fireX = 0;
        int fireY = 0;

        fireValidEntry();
        fireX = (int) Array.get(fireValidEntry(), 0);
        fireY = (int) Array.get(fireValidEntry(), 1);

        if (theBoard[fireX][fireY] == 1) {
            System.out.println("Hit.");
            theBoard[fireX][fireY] = 2;
            points++;
        } else if (theBoard[fireX][fireY] == 2) {
                System.out.println("You have already hit here.");

                fireValidEntry();
                fireX = (int) Array.get(fireValidEntry(), 0);
                fireY = (int) Array.get(fireValidEntry(), 1);

        } else if (theBoard[fireX][fireY] == 0){
            System.out.println("Miss");
        } else {
            System.out.println("Invalid entry");
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

    @NotNull
    @Contract(" -> new")
    private int[] fireValidEntry() {
        int fire1;
        int fire2;

        System.out.println("Where would you like to fire?\nEnter the x value:");
        try {
            fire1 = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
            fire1 = -1;
        }

        System.out.println("Enter the y value:");
        try {
            fire2 = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
            fire2 = -1;
        }
        return new int[] {fireX, fireY};
    }
}