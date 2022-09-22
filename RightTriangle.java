/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {


    public static void main(String[] args) {
        // System.out.println("Hello, World 2");

        // if (Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[1]) > 0
        //         && Integer.parseInt(args[2]) > 0) {
        //     System.out.printf("false");
        // }

        // int a = (int) Math.pow(Integer.parseInt(args[0]), 2);
        // int b = (int) Math.pow(Integer.parseInt(args[1]), 2);
        // int c = (int) Math.pow(Integer.parseInt(args[2]), 2);

        boolean negativeValuesCheck = (Integer.parseInt(args[0]) > 0
                && Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[2]) > 0);

        double a = Math.pow(Integer.parseInt(args[0]), 2);
        double b = Math.pow(Integer.parseInt(args[1]), 2);
        double c = Math.pow(Integer.parseInt(args[2]), 2);


        // System.out.printf("%b %n", negativeValuesCheck);
        boolean h1 = ((b + c) == a || (a + c) == b || (a + b) == c) && negativeValuesCheck;


        System.out.printf("%b %n", h1);
    }
}
