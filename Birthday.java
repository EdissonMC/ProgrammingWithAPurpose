// EJERCICIO 3
// https://coursera.cs.princeton.edu/introcs/assignments/arrays/specification.php
// Birthday problem. Suppose that people enter a room one at a time.
// How people must enter until two share a birthday?
// Counterintuitively, after 23 people enter the room,
// there is approximately a 50–50 chance that two share a birthday.
// This phenomenon is known as the birthday problem or birthday paradox.


// Write a program Birthday.java that takes two integer command-line arguments n and trials and performs the following experiment, trials times:
//
//         Choose a birthday for the next person, uniformly at random between 0 and n−1.
//         Have that person enter the room.
//         If that person shares a birthday with someone else in the room, stop; otherwise repeat.


// In each experiment, count the number of people that enter the room.
// Print a table that summarizes the results
// (the count i, the number of times that exactly i people enter the room, and the fraction of times
// that i or fewer people enter the room) for each possible value of i from 1 until the fraction reaches (or exceeds) 50%.


public class Birthday {
    public static void main(String[] args) {
        // System.out.println("happy");
        int n = Integer.parseInt(args[0]); // 365;
        int aleatorio = 0; // (int) Math.floor(Math.random() * N);
        // System.out.println(aleatorio);
        int[] totalPersonas = { 0 }; // new int[10];
        int TOTAL_TRIALS = Integer.parseInt(args[1]); // 1000000;
        // TRIALS ------------------------------------------------
        for (int trials = 0; trials < TOTAL_TRIALS; trials++) {

            // HABITACION -------------------------
            int[] room = new int[n];
            int countPersonas = 0;
            while (room[aleatorio] != 2) {
                aleatorio = (int) Math.floor(Math.random() * n);
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
        // System.out.println("< array personas >");
        // System.out.println(Arrays.toString(totalPersonas));
        // System.out.println("-----------------------------");


        //    MOSTRAR EL RESUMEN  DE LOS RESULTADOS
        double suma = 0.0;
        double promedio = 0;
        for (int i = 1; i < totalPersonas.length; i++) {
            suma = suma + totalPersonas[i];
            promedio = suma / TOTAL_TRIALS;
            System.out.printf("%d %d %f %n", i, totalPersonas[i], promedio);
            if (promedio >= 0.5) {
                break;
            }
        }

    }
}
