import java.util.Scanner

class Battleship {
    Scanner Hello = new Scanner(System.in);
    xAxis x;
    

    int xCoordinateStart = Hello.nextInt();
    xAxis xStart;
    if (xCoordinateStart = 1) x = xAxis.ONE;
    else if (xCoordinateStart = 2) x = xAxis.TWO;
    else if (xCoordinateStart = 3) x = xAxis.THREE;
    else if (xCoordinateStart = 4) x = xAxis.FOUR;
    else if (xCoordinateStart = 5) x = xAxis.FIVE;
    else if (xCoordinateStart = 6) x = xAxis.SIX;
    else if (xCoordinateStart = 7) x = xAxis.SEVEN;
    else if (xCoordinateStart = 8) x = xAxis.EIGHT;
    else if (xCoordinateStart = 9) x = xAxis.NINE;
    else if (xCoordinateStart = 10) x = xAxis.TEN;
    else x = null;

    yAxis yStart;
    xAxis xEnd;
    yAxis yEnd;

    public static void main(String[] args) {
        Battleship ship1 = new Battleship();
    }
}