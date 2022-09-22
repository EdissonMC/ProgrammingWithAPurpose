public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] sumas = new int[args.length];
        // System.out.println(args.length);
        sumas[0] = 0;
        int acum = 0;

        // SUMAS ACUMULATIVAS
        for (int i = 1; i < args.length; i++) {
            // System.out.println(Integer.parseInt(args[i]));
            acum = acum + Integer.parseInt(args[i]);
            sumas[i] = acum;
        }
        // VER LA MATRIZ DE SUMATORIA
        // System.out.println(Arrays.toString(sumas));

        int limite = sumas[sumas.length - 1];
        // System.out.println(limite);

        // GENERAR UN ALEATORIAO Y VERIFICAR LA POSICION EN EL RANGO
        for (int j = 0; j < m; j++) {
            // System.out.print("var" + j);


            int aleatorio = 0;
            aleatorio = (int) Math.floor(Math.random() * limite);
            // System.out.println("aleatorio : " + aleatorio);

            for (int i = 1; i < sumas.length; i++) {
                if (sumas[i - 1] <= aleatorio && aleatorio < sumas[i]) {
                    System.out.printf("%d ", i);
                }
            }

        }
    }
}
