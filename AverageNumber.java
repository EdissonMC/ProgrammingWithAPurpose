// Ingresar  datos secuencialmente y
// FINALIZAR SOLICITUD DE NUMEROS con el siguiente comando
// CRT + d

// 2 Ingresar datos mediante un archivo
// java-introcs AverageNumber < data.txt


public class AverageNumber {
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;
        while (!StdIn.isEmpty()) { // Read a number and cumulate the sum.
            double value = StdIn.readDouble();
            sum += value;
            cnt++;
        }

        double average = sum / cnt;
        StdOut.println("A verage is " +
                               average);
    }
}
