import java.util.Random;
import java.util.*;
import java.util.Arrays;

public class Boba extends Battleship {

    public Boba(int startX, int startY, int endX, int endY, int initialPoints) {
        x = startX;
        y = startY;
        x2 = endX;
        y2 = endY;
        points = initialPoints;
    }

    public static void randomizeShips() {
        Random randomizer = new Random();

        int[] milkTea = {2, 3, 3, 4, 5};

        for (Integer i : milkTea) {
            x = randomizer.nextInt(10);
            y = randomizer.nextInt(10);
            xOrY = randomizer.nextBoolean();
            int counter = 0;

            if (xOrY = true) {
                x2 = x;
                y2 = y + (int)milkTea.get(milkTea, i);
            } else {
                System.out.println("Nothing");
            }

            System.out.println(x);
            System.out.println(y);
            System.out.println(xOrY);
            System.out.println(x2);
            System.out.println(y2);
        }
    }

    public static void manuallyPlaceShips() {
        System.out.println("Where do you want to place your ships?\n" +
                "Insert your starting x point.\n" +
                "Please list the smaller point first.");
        x = Hello.nextInt();
        System.out.println("Insert your starting y point.\n" +
                "Please list the smaller point first.");
        y = Hello.nextInt();
        System.out.println("Insert your ending x point.");
        x2 = Hello.nextInt();
        System.out.println("Insert your ending y point.");
        y2 = Hello.nextInt();


    }

    public static void fire() {
        System.out.println("Where would you like to fire?\nInsert your x value:");
        int bye1 = Hello.nextInt();
        System.out.println("Insert your y value:");
        int bye2 = Hello.nextInt();

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
}