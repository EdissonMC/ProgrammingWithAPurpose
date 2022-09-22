public class PlotMap {
    public static void main(String[] args) {
        // Scale as per first four values. yi

        double xO = StdIn.readDouble();
        double yO = StdIn.readDouble();
        double xl = StdIn.readDouble();
        double yl = StdIn.readDouble();
        StdDraw.setXscale(xO, xl);
        StdDraw.setYscale(yO, yl);

        // Read and plot the rest of the points,
        while (!StdIn.isEmpty()) { // Read and plot a point.
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }
    }
}
