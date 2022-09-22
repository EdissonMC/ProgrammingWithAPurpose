public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] data = new double[a.length];
        for (int i = 0; i < a.length; i++)
            data[i] = a[i] * alpha;
        return data;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {

        double[] data = new double[a.length];
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--)
            data[i] = a[j];
        return data;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        int N = a.length + b.length;
        double[] data = new double[N];
        for (int i = 0; i < N; i++)
            if (i < a.length) {
                data[i] = a[i];
            }
            else {
                data[i] = b[i - a.length];
            }

        return data;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int N = a.length;
        if (b.length > a.length) {
            N = b.length;
        }
        double[] data = new double[N];

        for (int i = 0; i < N; i++) {

            double op1;
            double op2;
            if (i < a.length) {
                op1 = a[i];
            }
            else {
                op1 = 0;
            }

            if (i < b.length) {
                op2 = b[i];
            }
            else {
                op2 = 0;
            }


            data[i] = op1 + op2;
        }
        return data;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        // System.out.println(a.length);

        // System.out.println(N);
        int N = (int) (a.length / alpha);
        double[] data = new double[N];
        if (alpha > 0) {


            for (int i = 0; i < N; i++) {
                int index = (int) (i * alpha);
                // System.out.println(index);
                data[i] = a[index];
            }
            return data;
        }
        // else {
        //     int N = (int) (a.length / alpha);
        //     double[] data = new double[N];
        //     System.out.println("N" + N);
        //     for (int i = 0; i < N; i++) {
        //         // int index = (int) (i / alpha);
        //         // if (index >= N) {
        //         //     System.out.println("superado");
        //         //     index = ((int) (i / alpha)) - 1;
        //         // }
        //         int index = (int) (i * alpha);
        //         double aux = a[index];
        //         data[i] = aux;
        //     }
        //     return data;
        // }

        return data;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        // Amplificacion
        double[] data1A = StdAudio.read("harp.wav"); // new double[N + 1];
        data1A = amplify(data1A, 0.25);
        StdAudio.play(data1A);

        // Mix
        double[] data2A = StdAudio.read("piano.wav"); // new double[N + 1];
        double[] data2B = StdAudio.read("singer.wav"); // new double[N + 1];
        data2A = mix(data2A, data2B);
        StdAudio.play(data2A);

        // Merge
        double[] data3A = StdAudio.read("beatbox.wav"); // new double[N + 1];
        double[] data3B = StdAudio.read("chimes.wav"); // new double[N + 1];
        data3B = merge(data3A, data3B);
        StdAudio.play(data3B);

        // Reverse
        double[] data4A = StdAudio.read("scratch.wav"); // new double[N + 1];
        data4A = reverse(data4A);
        StdAudio.play(data4A);

        // Reverse
        double[] data5A = StdAudio.read("cow.wav"); // new double[N + 1];
        data5A = changeSpeed(data5A, 3);
        StdAudio.play(data5A);

    }


}
