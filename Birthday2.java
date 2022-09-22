import java.util.Arrays;

public class Birthday2 {
    public static void main(String[] args) {
        // System.out.println("happy");
        int N = 30;
        int aleatorio = (int) Math.floor(Math.random() * N);
        // System.out.println(aleatorio);
        int[] totalPersonas = new int[10];

        // TRIALS ------------------------------------------------
        for (int trials = 0; trials < 1000000; trials++) {

            // HABITACION -------------------------
            int[] room = new int[N];
            int countPersonas = 0;
            while (room[aleatorio] != 2) {
                aleatorio = (int) Math.floor(Math.random() * N);
                room[aleatorio] = room[aleatorio] + 1;
                countPersonas++;
                // System.out.println(aleatorio);

            }
            // FIN HABITACION -------------------------

            // System.out.println("----------------------------");
            // System.out.println(Arrays.toString(room));
            // System.out.printf("contador personas : %d", countPersonas);
            // System.out.println("");

            int[] newArr = new int[countPersonas + 1];
            if (totalPersonas.length <= countPersonas) {
                // System.out.println("-agrandando array-");
                for (int i = 0; i < totalPersonas.length; i++) {
                    newArr[i] = totalPersonas[i];
                }

                totalPersonas = newArr;
            }
            totalPersonas[countPersonas] = totalPersonas[countPersonas] + 1;

            // System.out.println("  ");
            // System.out.println("< array personas >");
            // System.out.println(Arrays.toString(totalPersonas));
            // System.out.println("-----------------------------");
        }
        System.out.println("< array personas >");
        System.out.println(Arrays.toString(totalPersonas));
        System.out.println("-----------------------------");

    }
}
