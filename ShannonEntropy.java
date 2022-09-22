public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] arr = new int[m + 1];
        int[] arrFrecuency = new int[m + 1];
        double[] arrProportion = new double[m + 1];
        int counter = 0;
        while (!StdIn.isEmpty()) { // Process one number,
            int t = StdIn.readInt();
            // StdOut.print(t + ":");
            arrFrecuency[t] = arrFrecuency[t] + 1;
            counter++;
        }

        // System.out.println(Arrays.toString(arr));
        // System.out.println("");
        // System.out.println("counter :" + counter);
        // System.out.println("");

        double total = 0.0;
        for (int i = 0; i < arrFrecuency.length; i++) {
            // arrProportion[i] = arrFrecuency[i] / (counter + 0.0);

            if (arrFrecuency[i] != 0) {
                // arrProportion[i] = (arrFrecuency[i] / (counter + 0.0)) * (Math.log(
                //         arrFrecuency[i] / (counter + 0.0))
                //         / Math.log(2));

                total = total + (arrFrecuency[i] / (counter + 0.0)) * (
                        Math.log(arrFrecuency[i] / (counter + 0.0))
                                / Math.log(2));
            }
            else {
                arrProportion[i] = 0;
                total = total + 0;
            }


        }
        total = -1 * (total);
        // System.out.println("arrFrecuency: ");
        // System.out.println(Arrays.toString(arrFrecuency));
        // System.out.println("arrProportion: ");
        // System.out.println(Arrays.toString(arrProportion));
        // System.out.println("");
        System.out.printf("%,.4f", total);
    }
}
