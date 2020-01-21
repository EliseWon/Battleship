package battleship;

import java.util.ArrayList;
import java.util.*;
import java.awt.Point;

public class ShipPlacement extends Boba {
    private int x, y, w, h;
    boolean isHorizontal;

    ShipPlacement(int startX, int startY, int width, int length, int initialPoints) {
        super(startX, startY, width, length, initialPoints);
    }

    void randomizeShips() {
        ArrayList<Integer> shipLengths = new ArrayList<>();
        shipLengths.add(1);
        shipLengths.add(2);
        shipLengths.add(2);
        shipLengths.add(3);
        shipLengths.add(4);


        for (int i : shipLengths) {
            int z = shipLengths.get(i);
            ArrayList<Integer> compareX = new ArrayList<Integer>();
            ArrayList<Integer> compareY = new ArrayList<Integer>();
            makeShip(z);

            while (x2 > 9 || y2 > 9) {
                makeShip(z);
            }

            for (int p = x; p < x2; p++) {
                for (int q = y; q < y2; q++) {
                    compareX.add(p);
                    compareY.add(q);

                    for (int i2 = 0; i2 < compareX.size(); i2++) {
                        makeShip(z);
                    }
                }
            }

            for (int m = 0; m < theBoard.length; m++) {
                for (int n = 0; n < theBoard[0].length; n++) {
                    while (theBoard[m][n] == theBoard[x][y] && theBoard[x][y] == 1) {

                    }
//                    for (int a = x; x < x2; x++) {
//                        for (int b = y; y < y2; y++) {
//                            theBoard[a][b] = 1;
//                        }
//                    }
                }
            }
            System.out.println("Start: " + x + ", " + y);
            System.out.println("End:" + x2 + ", " + y2);
        }
    }

//    void manuallyPlaceShips() {
//
//        for (int i = 0; i < 5; i++) {
//            int z = (int) Array.get(shipLengths, i);
//            int[] manualShipCoordinates = makeShip2(z);
//            x = (int) Array.get(manualShipCoordinates, 0);
//            y = (int) Array.get(manualShipCoordinates, 1);
//            x2 = (int) Array.get(manualShipCoordinates, 2);
//            y2 = (int) Array.get(manualShipCoordinates, 3);
//
//            while (x2 > 9 || y2 > 9) {
//                manualShipCoordinates = makeShip(z);
//                x = (int) Array.get(manualShipCoordinates, 0);
//                y = (int) Array.get(manualShipCoordinates, 1);
//                x2 = (int) Array.get(manualShipCoordinates, 2);
//                y2 = (int) Array.get(manualShipCoordinates, 3);
//            }
//
//            for (int m = 0; m < theBoard.length; m++) {
//                for (int n = 0; n < theBoard[0].length; n++) {
//                    while (theBoard[m][n] == theBoard[x][y] && theBoard[x][y] == 1) {
//                        makeShip2(z);
//                        manualShipCoordinates = makeShip2(z);
//                        x = (int) Array.get(manualShipCoordinates, 0);
//                        y = (int) Array.get(manualShipCoordinates, 1);
//                        x2 = (int) Array.get(manualShipCoordinates, 2);
//                        y2 = (int) Array.get(manualShipCoordinates, 3);
//                    }
//                    for (int a = x; x < x2; x++) {
//                        for (int b = y; y < y2; y++) {
//                            theBoard[a][b] = 1;
//                        }
//                    }
//                }
//            }
//        }
//    }
}
