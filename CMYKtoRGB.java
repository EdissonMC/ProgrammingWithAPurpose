/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {

        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = (1 - black);
        // System.out.printf("%-5s = %d %n", "white", white);
        int red = (int) Math.round((255 * white * (1 - cyan)));
        int green = (int) Math.round((255 * white * (1 - magenta)));
        int blue = (int) Math.round((255 * white * (1 - yellow)));
        System.out.printf("%-5s = %d %n", "red", red);
        System.out.printf("%-5s = %d %n", "green", green);
        System.out.printf("%-5s = %d %n", "blue", blue);
    }
}
