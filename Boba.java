import java.util.Random;

public class Boba extends Battleship {

    public Boba(int startX, int startY, int endX, int endY, int initialPoints) {
        x = startX;
        y = startY;
        x2 = endX;
        y2 = endY;
        points = initialPoints;
    }

    public void randomizeShips() {
        x = rand.nextInt(10);
        y = rand.nextInt(10);
        x2 = rand.nextInt(10);
        y2 = rand.nextInt(10);

        while 
    }

    public void manuallyPlaceShips() {
        System.out.println("Where do you want to place your ships?\n" +
                "Insert your starting x point.\n" +
                "Please list the smaller point first.");
        gudetama1 = Hello.nextInt();
        System.out.println("Insert your starting y point.\n" +
                "Please list the smaller point first.");
        gudetama2 = Hello.nextInt();
        System.out.println("Insert your ending x point.");
        gudetama3 = Hello.nextInt();
        System.out.println("Insert your ending y point.");
        gudetama4 = Hello.nextInt();


    }

    public void fire() {
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
                if (bye1 >= gudetama1 && bye1 <= gudetama3) {
                    if (bye2 >= gudetama2 && bye2 <= gudetama4) {
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