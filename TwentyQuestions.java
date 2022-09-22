public class TwentyQuestions {
    public static void main(String[] args) {
        // Generateanumberandanswerquestions
        // while the user tries to guess the value,
        int N = 1 + (int) (Math.random() * 100);
        StdOut.print("Ifm thinking of a number ");
        StdOut.println("between 1 and 100");
        int m = 0;
        while (m != N) { // Solicit one guess and provide one answer
            StdOut.print("What's your guess? ");

            m = StdIn.readInt();
            if (m == N) StdOut.println("You win!");
            if (m < N) StdOut.println("Toolow");
            if (m > N) StdOut.println("Toohigh");
        }
    }
}
