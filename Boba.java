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

            pearls = randomizer.nextInt(100);
            xOrY = randomizer.nextBoolean();

            if (xOrY == true) {
                x2 = x;
                y2 = y + (int) Array.get(milkTea, i);
            } else {
                y2 = y;
                x2 = x + (int) Array.get(milkTea, i);
            }
        }
    }

    public static void manuallyPlaceShips() {
        int[] milkTea2 = {2, 3, 3, 4, 5};
        int i = 0;
        String direction;

        for (i = 0; i < 5; i++) {
            System.out.println("Where do you want to place your ships?\n" +
                    "Insert your starting x point.\n" +
                    "Please list the left-most point first.");
            x = Hello.nextInt();
            System.out.println("Insert your starting y point.\n" +
                    "Please list the top-most point first.");
            y = Hello.nextInt();
            System.out.println("Horizontal or vertical?");
            direction = Hello.nextLine();

            if (direction.equalsIgnoreCase("Horizontal")) {
                x2 = x + (int) Array.get(milkTea2, i);
            } else if (direction.equalsIgnoreCase("Vertical")) {
                y2 = y + (int) Array.get(milkTea2, i);
            } else {
                System.out.println("Not a valid direction.");
            }
        }
    }

        public static void fire () {
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

        public static void computerFire () {
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