// Checkerboard.  Write a program Checkerboard.java that takes a command-line integer n and plots an n-by-n checkerboard pattern to standard drawing. Color the squares blue and light gray, with the bottom-left square blue. To draw,
//         Call StdDraw.setScale(0, n) so that x- and y-coordinates of the canvas range from 0 and n.
//         Call either StdDraw.filledSquare() or StdDraw.filledPolygon() to draw each of the n2 squares.
//         Make sure that the squares fit snugly in the standard drawing window.
//         Do not change the canvas size.
// Ejecutar el programa
// java-introcs Checkerboard 5
// 8-by-8 checkerboard

public class Checkerboard {
    public static void main(String[] args) {

        int numberSquares = Integer.parseInt(args[0]);
        double size = numberSquares * numberSquares;
        StdDraw.setXscale(0, numberSquares);
        StdDraw.setYscale(0, numberSquares);
        // boolean rotar = true;
        int y = -1;
        int x = 0;
        boolean rotaColor = true;
        boolean rotaColorInicial = true;

        for (int i = 0; i < size; i++) {


            if (i % (numberSquares) == 0) {
                y = y + 1;
                x = 0;

                rotaColor = !rotaColorInicial;
                rotaColorInicial = !rotaColorInicial;
            }
            else {
                x = x + 1;
                rotaColor = !rotaColor;
            }

            if (rotaColor) {
                StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                // System.out.println("AZUL " + i);
            }
            else {
                StdDraw.setPenColor(StdDraw.BLUE);
                // System.out.println("ROJO " + i);
            }
            StdDraw.filledSquare(x + 0.5, y + 0.5, 1.0 / 2.0);
            // System.out.printf("i= %d  x= %d y= %d  %n", i, x, y);

            // System.out.println("----------------------");


        }

        // WAY 2
        // for (int y = 0; y < numberSquares; y++) {
        //     if (numberSquares % 2 == 0) {
        //         rotar = !rotar;
        //     }
        //     for (int x = 0; x < numberSquares; x++) {
        //         rotar = !rotar;
        //         if (rotar) {
        //             StdDraw.setPenColor(StdDraw.BLUE);
        //
        //         }
        //         if (rotar) {
        //             StdDraw.setPenColor(StdDraw.BLUE);
        //
        //         }
        //         else {
        //             StdDraw.setPenColor(StdDraw.RED);
        //
        //         }
        //         StdDraw.filledSquare(x + 0.5, y + 0.5, 1.0 / 2.0);
        //
        //     }
        // }

        // WAY 3
        // StdDraw.filledSquare(0 + 0.5, 0.0 + 0.5, 1.0 / 2.0);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.filledSquare(1.0 + 0.5, 0.0 + 0.5, 1.0 / 2.0);
        // StdDraw.setPenColor(StdDraw.RED);
        // StdDraw.filledSquare(2.0 + 0.5, 0.0 + 0.5, 1.0 / 2.0);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.filledSquare(3.0 + 0.5, 0.0 + 0.5, 1.0 / 2.0);
        // StdDraw.setPenColor(StdDraw.RED);
        // StdDraw.filledSquare(4.0 + 0.5, 0.0 + 0.5, 1.0 / 2.0);
        //

        // double numberSquares = Double.parseDouble(args[0]);
        // double size = 1.0 / numberSquares;
        // StdDraw.setXscale(0, 1);
        // StdDraw.setYscale(0, 1);
        // boolean rotar = true;
        // for (int i = 0; i < numberSquares; i++) {
        //     if (numberSquares % 2 == 0) {
        //         rotar = !rotar;
        //     }
        //     for (int j = 0; j < numberSquares; j++) {
        //         rotar = !rotar;
        //         if (rotar) {
        //             StdDraw.setPenColor(StdDraw.BLUE);
        //
        //         }
        //         else {
        //             StdDraw.setPenColor(StdDraw.RED);
        //
        //         }
        //
        //         StdDraw.filledSquare((size / 2) + ((size / 2) * j * 2),
        //                              (size / 2) + ((size / 2) * i * 2),
        //                              size / 2);
        //
        //         System.out.println(rotar);
        //     }
        //     System.out.println("-------");
        //     // rotar = !rotar;
        // }


    }
}
