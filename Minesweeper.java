public class Minesweeper {
    public static void main(String[] args) {
        // int m = 5;
        // int n = 4;
        // int k = 3;

        int n = Integer.parseInt(args[0]); // 5;
        int m = Integer.parseInt(args[1]); // 4;
        int k = Integer.parseInt(args[2]); // 3;


        int[][] matrix = new int[n][m];
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
            if (matrix[y][x] == 0) {

                matrix[y][x] = 99;
                contador++;

                axisX[puntero] = x;
                axisY[puntero] = y;
                puntero++;
            }

            // System.out.println("contador" + contador);
        }


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
                if (matrix[y][x] != 99) {
                    for (int indice = 0; indice < k; indice++) {
                        // System.out.printf("x= %d y= %d, axisX = %d axisX = %d %n", x, y,
                        //                   axisX[indice],
                        //                   axisY[indice]);
                        if (Math.abs(x - axisX[indice]) <= 1 && Math.abs(y - axisY[indice]) <= 1) {
                            // System.out.println("encontrado");
                            matrix[y][x] = matrix[y][x] + 1;
                        }
                    }
                }
                // System.out.println(" ----------------- ");

            }

        }


        //    MOSTRANDO
        // System.out.println("  ");

        // for (int i = 0; i < n; i++) {
        //     System.out.println(Arrays.toString(matrix[i]));
        // }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {

                if (matrix[y][x] == 99) {
                    System.out.printf("%s  ", "*");
                }
                else {
                    System.out.printf("%s  ", matrix[y][x]);
                }


            }
            System.out.printf("%n");
        }


    }
}
