public class RandomWalkers {
    public static void main(String[] args) {
        // int MD = 5;
        int MD = Integer.parseInt(args[0]); // 5
        int trials = Integer.parseInt(args[1]);// 10000;

        double averange = 0;
        int sum = 0;

        for (int i = 0; i < trials; i++) {
            // System.out.printf("trials %d %n", i);

            int aleatorio = 0;
            int x = 0;
            int y = 0;
            int steps = 0;
            while (Math.abs(x) + Math.abs(y) != MD) {
                // System.out.printf("(%d, %d) %d%n", x, y, aleatorio);

                // System.out.printf("(%d, %d) %n", x, y);
                aleatorio = 1 + (int) (Math.random() * 4);
                if (aleatorio == 1) {
                    y = y + 1;
                }
                else if (aleatorio == 2) {
                    x = x + 1;
                }
                else if (aleatorio == 3) {
                    x = x - 1;
                }
                else {
                    y = y - 1;
                }

                steps++;
            }

            // System.out.printf("(%d, %d) %d%n", x, y, aleatorio);
            // System.out.printf("(%d, %d) %n", x, y);
            // System.out.printf("steps %d %n", steps);
            sum = sum + steps;
        }// end for

        averange = sum * (1.00) / trials * (1.00);
        System.out.printf("average number of steps = %f", averange);
    }
}
