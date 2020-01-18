package battleship;

public class comment {
    //    void randomizeShips() {
//
//        for (int i = 0; i < shipLengths.length; i++) {
//            int z = shipLengths[i];
//            int[] randomizedShipCoordinates = makeShip(z);
//            x = (int) Array.get(randomizedShipCoordinates, 0);
//            y = (int) Array.get(randomizedShipCoordinates, 1);
//            x2 = (int) Array.get(randomizedShipCoordinates, 2);
//            y2 = (int) Array.get(randomizedShipCoordinates, 3);
//            int dsdsjk = 4;
//
//            while (x2 > 9 || y2 > 9) {
//                randomizedShipCoordinates = makeShip(z);
//                x = (int) Array.get(randomizedShipCoordinates, 0);
//                y = (int) Array.get(randomizedShipCoordinates, 1);
//                x2 = (int) Array.get(randomizedShipCoordinates, 2);
//                y2 = (int) Array.get(randomizedShipCoordinates, 3);
//                int kld = 4;
//            }
//
//            for (int m = 0; m < theBoard.length; m++) {
//                for (int n = 0; n < theBoard[0].length; n++) {
//                    while (theBoard[m][n] == theBoard[x][y] && theBoard[x][y] == 1) {
//                        randomizedShipCoordinates =  makeShip(z);
//                        x = (int) Array.get(randomizedShipCoordinates, 0);
//                        y = (int) Array.get(randomizedShipCoordinates, 1);
//                        x2 = (int) Array.get(randomizedShipCoordinates, 2);
//                        y2 = (int) Array.get(randomizedShipCoordinates, 3);
//                    }
//                    int sdkfjfdkls = 4;
//                    for (int a = x; x < x2; x++) {
//                        for (int b = y; y < y2; y++) {
//                            theBoard[a][b] = 1;
//                        }
//                        int sldlkf = 4;
//                    }
//                    int slk = 4 ;
//                }
//                int aslkdfj = 4;
//            }
//            System.out.println("Start: " + x + ", " + y);
//            System.out.println("End:" + x2 + ", " + y2);
//        }
//        int ksdl = 4;
//    }
//
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
