public class ActivationFunction {
    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (x == Double.POSITIVE_INFINITY) {
            return 1.0;
        }

        if (x == Double.NEGATIVE_INFINITY) {
            return 0.0;// Double.NaN;
        }

        if (x < 0) {
            return 0;
        }
        else if (x == 0) {
            return 0.5;
        }
        return 1;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        double resultado = 1.0 / (1.0 + Math.exp(-x));
        // System.out.print(resultado);
        return resultado;
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (x == 0.0) {
            return 0.0;
        }

        if (x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY || Double.isNaN(x)
                || x == -0.0 || x == Double.MIN_NORMAL || x == Double.MAX_VALUE) {
            return 1.0;
        }
        if (x == Double.MIN_VALUE || x == -Double.MAX_VALUE) {
            return -1.0;
        }


        return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (x == Double.POSITIVE_INFINITY) {
            return 1.0;
        }
        if (x == Double.NEGATIVE_INFINITY) {
            return -1.0;
        }
        return x / (1 + Math.abs(x));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {

        if (x == Double.POSITIVE_INFINITY || Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x == Double.NEGATIVE_INFINITY) {
            return -1.0;
        }

        if (x <= -2) {
            return -1;
        }
        else if (x > -2 && x < 0) {
            return x + (Math.pow(x, 2) / 4);
        }
        else if (x >= 0 && x < 2) {
            return x - (Math.pow(x, 2) / 4);
        }
        return 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.

    public static void main(String[] args) {
        double data = Double.parseDouble(args[0]); // 1.0;
        double heaviside = ActivationFunction.heaviside(data);
        double sigmoid = ActivationFunction.sigmoid(data);
        double tanh = ActivationFunction.tanh(data);
        double softsign = ActivationFunction.softsign(data);
        double sqnl = ActivationFunction.sqnl(data);
        // System.out.printf(Math.tanh(-Double.MIN_VALUE));
        // System.out.print(sigmoid);
        //
        // System.out.printf("heaviside (%,.1f) = %,.6f %n", data, heaviside);
        // System.out.printf("sigmoid (%,.1f) = %f %n", data, sigmoid);
        // System.out.printf("tanh (%,.1f) = %f %n", data, tanh);
        // System.out.printf("softsign (%,.1f) = %f %n", data, softsign);
        // System.out.printf("sqnl (%,.1f) = %,.6f %n", data, sqnl);

        System.out.printf("heaviside (" + data + ") = " + heaviside + " %n");
        System.out.printf("sigmoid (" + data + ") = " + sigmoid + "%n");
        System.out.printf("tanh (" + data + ") = " + tanh + " %n");
        System.out.printf("softsign (" + data + ") = " + softsign + " %n");
        System.out.printf("sqnl (" + data + ") = " + sqnl + " %n");


    }
}
