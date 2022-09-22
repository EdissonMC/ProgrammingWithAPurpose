public class RangeFilter {
    public static void main(String[] args) {
        int lo = Integer.parseInt(args[0]);
        int hi = Integer.parseInt(args[1]);
        while (!StdIn.isEmpty()) { // Process one number,
            int t = StdIn.readInt();
            if (t >= lo && t <= hi) StdOut.print(t + " ");
        }
        StdOut.println();
    }
}
