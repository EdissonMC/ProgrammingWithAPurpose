/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        // if (Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[1]) > 0
        //         && Integer.parseInt(args[2]) > 0) {
        //     System.out.printf("false");
        // }


        // double x1 = Math.toRadians(a);
        // double x1 = Double.parseDouble(args[0]);
        // double y1 = Double.parseDouble(args[1]);
        // double x2 = Double.parseDouble(args[2]);
        // double y2 = Double.parseDouble(args[3]);

        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // double x1 = Math.toRadians(Long.parseLong(args[0]));
        // double y1 = Math.toRadians(Long.parseLong(args[1]));
        // double x2 = Math.toRadians(Long.parseLong(args[2]));
        // double y2 = Math.toRadians(Long.parseLong(args[3]));


        // double termino1 = Math.pow(Math.sin((x2 - x1) / 2.0), 2);
        // BigDecimal termino1 = new BigDecimal(7.000000153945671);
        double termino1 = Math.pow(Math.sin((x2 - x1) / 2.0), 2); // 7.000000153945671;
        double termino2 = Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2.0), 2);
        // System.out.printf(" %5.16e termino1 %n", termino1);
        // System.out.printf(" %f termino2 %n", termino2);
        double distance = 2 * (6371.00000) * Math.asin(Math.sqrt(termino1 + termino2));
        System.out.printf(" %5.16e kilometers %n", distance);


    }
}
