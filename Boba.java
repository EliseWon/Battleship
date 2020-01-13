import java.util.Random;
import java.util.*;
import java.util.Arrays;
import java.lang.Object;
import java.lang.reflect.Array;

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
        int i = 0;

        for (i = 0; i < 5; i++) {
            x = randomizer.nextInt(10);
            y = randomizer.nextInt(10);

            pearls = randomizer.nextInt(10);
            crystalBoba = String.valueOf(pearls / 2);
            try {
                Integer.valueOf(crystalBoba);
                xOrY = true;
            } catch (NumberFormatException e) {
                xOrY = false;
            }

            if (xOrY = true) {
                x2 = x;
                y2 = y + (int)Array.get(milkTea, i);
            } else {
                y2 = y;
                x2 = x + (int)Array.get(milkTea, i);
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
        try {
            x = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
        }
        System.out.println("Insert your starting y point.\n" +
                "Please list the smaller point first.");
        try {
            y = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
        }
        System.out.println("Insert your ending x point.");
        try {
            x2 = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
        }
        System.out.println("Insert your ending y point.");
        try {
            y2 = Hello.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Not an integer.");
        }


    }

    public static void fire() {
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
}