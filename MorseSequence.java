import java.util.Arrays;


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

public class MorseSequence {
    public static int[] complemento(int[] original) {

        int[] numeros = original;

        int[] newNumeros = new int[numeros.length * 2];
        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i);
            newNumeros[i] = numeros[i];
        }

        int newLongitud = numeros.length * 2;
        for (int i = 0, j = numeros.length; j < newLongitud; j++, i++) {
            System.out.println(j);
            newNumeros[j] = numeros[i] == 0 ? 1 : 0;
        }
        // System.out.println(Arrays.toString(newNumeros));
        return newNumeros;
    }

    private static int[] generadorSequenceMorse(int N) {
        int[] prueba = { 0 };
        // int[] resultado = complemento(prueba);
        int[] resultado = { 0 };

        int generador = N;// 8
        int bandera = 0;
        while (resultado.length < generador) {
            System.out.println(bandera);
            bandera++;
            resultado = complemento(resultado);
        }
        // System.out.println(Arrays.toString(resultado));

        return resultado;
    }

    public static void main(String[] args) {

        System.out.println(generadorSequenceMorse(2));
    }
}
