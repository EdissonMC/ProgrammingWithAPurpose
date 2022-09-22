// ejecutar asi:
// java Minesweeper 4 4 3
public class Minesweeper3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // 5;
        int m = Integer.parseInt(args[1]); // 4;
        int k = Integer.parseInt(args[2]); // 3;

        String[][] matrix = new String[n][m];


        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {

                matrix[y][x] = "0";
            }
        }


        int[] axisX = new int[k];
        int[] axisY = new int[k];

        int aleatorio = 0;
        int limite = n * m;
        int contador = 0;
        int puntero = 0;
        while (contador < k) {
            aleatorio = (int) Math.floor(Math.random() * limite);

            // System.out.println("aleatorio" + aleatorio);
            int y = aleatorio / m;
            int x = aleatorio % m;


            // System.out.println("y" + y);
            // System.out.println("x" + x);
            if (matrix[y][x].equals("0")) {

                matrix[y][x] = "*";
                contador++;

                axisX[puntero] = x;
                axisY[puntero] = y;
                puntero++;
            }

            // System.out.println("contador" + contador);
        }

        //
        // for (int i = 0; i < n; i++) {
        //     System.out.println(Arrays.toString(matrix[i]));
        // }
        //
        // for (int i = 0; i < k; i++) {
        //     System.out.printf("%d %d %n", axisX[i], axisY[i]);
        //
        // }

        // RELLENANDO
        for (int y = 0; y < n; y++) {

            for (int x = 0; x < m; x++) {

                // System.out.printf("%d ", matrix[y][x]);
                // System.out.printf("%n");
                if (!matrix[y][x].equals("*")) {
                    for (int indice = 0; indice < k; indice++) {
                        // System.out.printf("x= %d y= %d, axisX = %d axisX = %d %n", x, y,
                        //                   axisX[indice],
                        //                   axisY[indice]);
                        if (Math.abs(x - axisX[indice]) <= 1 && Math.abs(y - axisY[indice]) <= 1) {
                            // System.out.println("encontrado");
                            matrix[y][x] = String.valueOf(Integer.parseInt(matrix[y][x]) + 1);
                        }
                    }
                }
                // System.out.println(" ----------------- ");

            }

        }


        //    MOSTRANDO
        // System.out.println("  ");
        //
        // for (int i = 0; i < n; i++) {
        //     System.out.println(Arrays.toString(matrix[i]));
        // }
        // System.out.println("  ");
        // System.out.println("  ");
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {

                System.out.printf("%s  ", matrix[y][x]);
            }
            System.out.printf("%n");
        }


    }
}
