// Band matrices. Write a program BandMatrix.java
// that takes two integer command-line arguments n and width
// and prints an n-by-n pattern like the ones below,
//             n=8 distance=3
//         *  *  *  *  0  0  0  0
//         *  *  *  *  *  0  0  0
//         *  *  *  *  *  *  0  0
//         *  *  *  *  *  *  *  0
//         0  *  *  *  *  *  *  *
//         0  0  *  *  *  *  *  *
//         0  0  0  *  *  *  *  *
//         0  0  0  0  *  *  *  *
//
// with a zero (0) for each element whose distance from the
// main diagonal is strictly more than width, and an asterisk (*)
// for each entry that is not, and two spaces between each 0 or *.


// ~/Desktop/loops> java BandMatrix 8 0
//         *  0  0  0  0  0  0  0
//         0  *  0  0  0  0  0  0
//         0  0  *  0  0  0  0  0
//         0  0  0  *  0  0  0  0
//         0  0  0  0  *  0  0  0
//         0  0  0  0  0  *  0  0
//         0  0  0  0  0  0  *  0
//         0  0  0  0  0  0  0  *
//
//         ~/Desktop/loops> java BandMatrix 8 1
//         *  *  0  0  0  0  0  0
//         *  *  *  0  0  0  0  0
//         0  *  *  *  0  0  0  0
//         0  0  *  *  *  0  0  0
//         0  0  0  *  *  *  0  0
//         0  0  0  0  *  *  *  0
//         0  0  0  0  0  *  *  *
//         0  0  0  0  0  0  *  *
//
//         ~/Desktop/loops> java BandMatrix 8 2
//         *  *  *  0  0  0  0  0
//         *  *  *  *  0  0  0  0
//         *  *  *  *  *  0  0  0
//         0  *  *  *  *  *  0  0
//         0  0  *  *  *  *  *  0
//         0  0  0  *  *  *  *  *
//         0  0  0  0  *  *  *  *
//         0  0  0  0  0  *  *  *
//
//         ~/Desktop/loops> java BandMatrix 8 3
//         *  *  *  *  0  0  0  0
//         *  *  *  *  *  0  0  0
//         *  *  *  *  *  *  0  0
//         *  *  *  *  *  *  *  0
//         0  *  *  *  *  *  *  *
//         0  0  *  *  *  *  *  *
//         0  0  0  *  *  *  *  *
//         0  0  0  0  *  *  *  *

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);// 8
        int distancia = Integer.parseInt(args[1]);// 3;
        int diagonal = 1;

        for (int i = 1; i <= n; i++) {

            // System.out.println("numero : " + sum);
            for (int j = 1; j <= n; j++) {

                // System.out.printf("%d ", diagonal);
                if (Math.abs(j - diagonal) <= distancia) {
                    // System.out.printf("%d ", Math.abs(j - diagonal));
                    System.out.printf("*  ");

                }
                else {
                    System.out.printf("0  ");
                }

            }
            diagonal++;

            System.out.println("");
        }

    }
}
