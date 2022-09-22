public class PlayThatTune {
    public static void main(String[] args) {
        // Read a tune from Stdin and play it.
        int sps = 44100;
        while (!StdIn.isEmpty()) {
            // Read and play one note,

            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();

            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (sps * duration); // Numero de muestras

            double[] data = new double[N + 1];
            for (int i = 0; i <= N; i++)
                data[i] = Math.sin(2 * Math.PI * i * hz / sps);
            StdAudio.play(data);
        }
    }
}
