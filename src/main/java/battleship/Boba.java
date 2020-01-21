package battleship;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.Random;

public class Boba extends Battleship {

    int[][] theBoard = new int[][] { {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,}};

    Boba(int startX, int startY, int endX, int endY, int initialPoints) {
        x = startX;
        y = startY;
        x2 = endX;
        y2 = endY;
        points = initialPoints;
    }

//comment extracted here

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
}