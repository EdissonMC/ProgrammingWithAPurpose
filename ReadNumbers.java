public class ReadNumbers {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) { // Process one number,
            int t = StdIn.readInt();
            StdOut.print(t + " ");
        }
    }
}
