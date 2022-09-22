public class WorldMap {
    public static void main(String[] args) {
        // Scale as per first four values. yi

        int scaleX = StdIn.readInt();
        int scaleY = StdIn.readInt();
        StdDraw.enableDoubleBuffering();

        StdDraw.setCanvasSize(scaleX, scaleY);
        StdDraw.setXscale(0, scaleX);
        StdDraw.setYscale(0, scaleY);


        // for (int i = 0; i < 2; i++) {
        while (!StdIn.isEmpty()) {

            String city = StdIn.readString();
            int numberVertices = StdIn.readInt();
            // System.out.printf(" %s %d %n", city, numberVertices);

            // System.out.printf(" %d %d %s %d %n", scaleX, scaleY, city, numberVertices);

            double[] xVertices = new double[numberVertices];
            double[] yVertices = new double[numberVertices];
            int iterador = 0;
            while (numberVertices != 0) { // Read and plot a point.
                double x = StdIn.readDouble();
                double y = StdIn.readDouble();
                xVertices[iterador] = x;
                yVertices[iterador] = y;
                // System.out.printf("%f %f %n", x, y);
                numberVertices--;
                iterador++;
                // StdDraw.point(x, y);
            }
            StdDraw.polygon(xVertices, yVertices);
        }
        StdDraw.show();

        // double xl = StdIn.readDouble();
        // double yl = StdIn.readDouble();
        // StdDraw.setXscale(xO, xl);
        // StdDraw.setYscale(yO, yl);

        // Read and plot the rest of the points,
        // while (!StdIn.isEmpty()) { // Read and plot a point.
        //     double x = StdIn.readDouble();
        //     double y = StdIn.readDouble();
        //     StdDraw.point(x, y);
        // }
    }
}
