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
        int[] crystalBobaX = {-1, -1, -1, -1, -1};
//        int[] crystalBobaY = {-1, -1, -1, -1, -1};
        int a = 0;
        int b = 0;

        for (int i = 0; i < 5; i++) {

//            for (int a = 0; a < crystalBobaX.length; a++) {
//                x = randomizer.nextInt(10);
//                crystalBobaX[a] = x;
//                while ((int) Array.get(crystalBobaX, a) == x) {
//                    x = randomizer.nextInt(10);
//                }
//                crystalBobaX[a] = x;
//            }

            x = randomizer.nextInt(10);
            y = randomizer.nextInt(10);
            xOrY = randomizer.nextBoolean();

            if (xOrY == true) {
                x2 = x;
                y2 = y + (int) Array.get(milkTea, i);
            } else {
                y2 = y;

                //for (a = 0; a < crystalBobaX.length; a++) {
                    for (x2 = x + (int) Array.get(milkTea, i); x < x2; x++) {
                        for (b = 0; b < (int) Array.get(milkTea, i); b++) {
                             if ((int) Array.get(crystalBobaX, a) + b == x) {
                                 x = randomizer.nextInt(10);
                             }
                        }
                    }
                    crystalBobaX[a] = x;
                //}
            }
            System.out.println(x);

        }
    }

    public static void manuallyPlaceShips() {
        int[] milkTea2 = {2, 3, 3, 4, 5};
        int i = 0;
        String direction;

        for (i = 0; i < 5; i++) {
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
                x2 = x + (int) Array.get(milkTea2, i);
                y2 = y;
            } else if (direction.equalsIgnoreCase("Vertical")) {
                y2 = y + (int) Array.get(milkTea2, i);
                x2 = x;
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

        public static void computerFire() {
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