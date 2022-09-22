// Thue–Morse weave. Write a program ThueMorse.java
// that takes an integer command-line argument n
// and prints an n-by-n pattern like the ones below.
// Include two space characters between each + and - character.

// The Thue–Morse sequence is an infinite sequence of 0s and 1s
// that is constructed by starting with 0 and successively
// appending the bitwise negation (interchange 0s and 1s)
// of the existing sequence. Here are the first few steps
// of this construction:

// 0
// 0 1
// 0 1 1 0
// 0 1 1 0 1 0 0 1
// 0 1 1 0 1 0 0 1 1 0 0 1 0 1 1 0


// To visualize the Thue–Morse sequence, create an n-by-n pattern
// by printing a + (plus sign) in row i and column j
// if bits i and j in the sequence are equal, and a - (minus sign) if they are different.


// Note: you may assume that n is a positive integer (but it need not be a power of 2).
// The Thue–Morse sequence has many fascinating properties and arises in graphic design and in music composition.


public class ThueMorse {

    // public int[] complemento(int[] original) {
    //
    //     int[] numeros = original;
    //
    //     int[] newNumeros = new int[numeros.length * 2];
    //     // System.out.println(Arrays.toString(numeros));
    //
    //     for (int i = 0; i < numeros.length; i++) {
    //         // System.out.println(i);
    //         newNumeros[i] = numeros[i];
    //     }
    //
    //     int newLongitud = numeros.length * 2;
    //     for (int i = 0, j = numeros.length; j < newLongitud; j++, i++) {
    //         // System.out.println(j);
    //         newNumeros[j] = numeros[i] == 0 ? 1 : 0;
    //     }
    //     // System.out.println(Arrays.toString(newNumeros));
    //     return newNumeros;
    // }


    public static void main(String[] args) {
        // ThueMorse miCodigo = new ThueMorse();

        int generador = Integer.parseInt(args[0]); // 8


        // GENERAR SECUENCIA MORSE  ---------------------------------

        int[] resultado = { 0 };

        // int bandera = 0;
        while (resultado.length < generador) {
            // System.out.println(bandera);
            // bandera++;

            // COMPLEMENTO Y CONCATENACION  ------------------------------
            int[] numeros = resultado;

            int[] newNumeros = new int[numeros.length * 2];
            // System.out.println(Arrays.toString(numeros));

            // for (int i = 0; i < numeros.length; i++) {
            //     // System.out.println(i);
            //     newNumeros[i] = numeros[i];
            // }

            int newLongitud = numeros.length * 2;
            for (int j = numeros.length; j < newLongitud; j++) {
                // System.out.println(j);
                newNumeros[j - numeros.length] = numeros[j - numeros.length];
                newNumeros[j] = numeros[j - numeros.length] == 0 ? 1 : 0;
            }

            // for (int i = 0, j = numeros.length; j < newLongitud; j++, i++) {
            //     // System.out.println(j);
            //     newNumeros[i] = numeros[i];
            //     newNumeros[j] = numeros[i] == 0 ? 1 : 0;
            // }

            // FIN COMPLENTO Y CONTACTENACION -----------------------------
            resultado = newNumeros; // miCodigo.complemento(resultado);


        }
        // System.out.println(Arrays.toString(resultado));

        int[] linea = resultado;

        //  FIN GENERAR SECUENCIA MORSE ----------------------------------------------------------


        for (int i = 0; i < generador; i++) {
            // System.out.println(i);
            for (int j = 0; j < generador; j++) {
                // System.out.print(j);
                String show = linea[i] == linea[j] ? "+  " : "-  ";
                System.out.print(show);

            }
            System.out.println("");
        }

        // System.out.println(Arrays.toString(linea));
    }

}
