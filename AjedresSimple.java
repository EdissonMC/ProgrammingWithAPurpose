public class AjedresSimple {
    public static void main(String[] args) {
        // int N = 100;
        //
        // double[] x = new double[N + 1];
        // double[] y = new double[N + 1];
        //
        // for (int i = 0; i <= N; i++) {
        //     x[i] = Math.PI * i / N;
        // }
        //
        // for (int i = 0; i <= N; i++) {
        //     y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
        // }
        //
        // StdDraw.setXscale(0, Math.PI);
        // StdDraw.setYscale(-2.0, 2.0);
        //
        // for (int i = 1; i <= N; i++) {
        //     StdDraw.line(x[i - 1], y[i - 1], x[i], y[i]);
        // }
        double numberSquares = Double.parseDouble(args[0]);
        double size = 1.0 / numberSquares;
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        boolean rotar = true;
        for (int i = 0; i < numberSquares; i++) {
            if (numberSquares % 2 == 0) {
                rotar = !rotar;
            }
            for (int j = 0; j < numberSquares; j++) {
                rotar = !rotar;
                if (rotar) {
                    StdDraw.setPenColor(StdDraw.BLUE);

                }
                else {
                    StdDraw.setPenColor(StdDraw.RED);

                }

                StdDraw.filledSquare((size / 2) + ((size / 2) * j * 2),
                                     (size / 2) + ((size / 2) * i * 2),
                                     size / 2);

                System.out.println(rotar);
            }
            System.out.println("-------");
            // rotar = !rotar;
        }


        // StdDraw.setPenColor(StdDraw.RED);
        // StdDraw.filledSquare(0.5, 1.5, 0.5);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.filledSquare(0.5, 2.5, 0.5);
        // StdDraw.setPenColor(StdDraw.RED);
        // StdDraw.filledSquare(0.5, 3.5, 0.5);

        // StdDraw.square(2, 2, 1);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.filledSquare(0.5, 0.5, 0.5);
        // StdDraw.setPenColor(StdDraw.RED);
        // StdDraw.filledSquare(0.5, 1.5, 0.5);
        // StdDraw.setPenColor(StdDraw.BLUE);
        // StdDraw.filledSquare(0.5, 2.5, 0.5);
        // StdDraw.setPenColor(StdDraw.RED);
        // StdDraw.filledSquare(0.5, 3.5, 0.5);
    }
}
