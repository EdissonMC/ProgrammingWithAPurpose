public class Divisors {


    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        int dato1 = Math.abs(a); // 987; // 1440;
        int dato2 = Math.abs(b); // 610; // 408;
        int aux = 0;

        while (dato2 != 0) {
            // System.out.printf("%d %d %n", dato1, dato2);
            aux = dato1;
            dato1 = dato2;
            dato2 = aux % dato2;
        }

        // System.out.println(dato1);
        return dato1;
    }

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int gcd = gcd(a, b);
        // System.out.println("gcd" + gcd);
        int division = Math.abs(a) / gcd;
        // System.out.println("division" + division);
        return division * Math.abs(b);
    }

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {

        return gcd(a, b) == 1;
    }

    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (areRelativelyPrime(i, n)) {
                counter++;
            }
        }

        return counter;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.


    public static void main(String[] args) {

        int dato1 = Integer.parseInt(args[0]);
        int dato2 = Integer.parseInt(args[1]);

        System.out.printf("gcd(%d, %d) = %d %n", dato1, dato2, Divisors.gcd(dato1, dato2));
        System.out.printf("lcm(%d, %d) = %d %n", dato1, dato2, Divisors.lcm(dato1, dato2));
        System.out.printf("areRelativelyPrime(%d, %d) = %b %n", dato1, dato2,
                          Divisors.areRelativelyPrime(dato1, dato2));
        System.out.printf("totient(%d) = %d %n", dato1, Divisors.totient(dato1));
        System.out.printf("totient(%d) = %d %n", dato1, Divisors.totient(dato2));

    }
}
