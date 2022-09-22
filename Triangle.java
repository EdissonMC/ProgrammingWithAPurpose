public class Triangle {
    public static void main(String[] args) {

        double t = Math.sqrt(3.0)
                / 2.0;

        // StdDraw.setXscale(0, 10);
        // StdDraw.setYscale(0, 10);
        StdDraw.setPenRadius(0.01); // Default 0.002
        StdDraw.line(0.0, 0.0, 1.0, 0.0);

        StdDraw.line(1.0, 0.0, 0.5, 0.5);
        StdDraw.line(0.5, 0.5, 0.0, 0.0);
        // StdDraw.point(0.5, t / 3.0);

    }

}
