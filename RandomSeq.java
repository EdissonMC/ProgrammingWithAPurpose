// Genera numeros aleatorios
// podemos Agregarlos a un archivo mediante el siguiente comando
// java RandomSeq 10 > data1.txt
public class RandomSeq {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++)
            System.out.println(Math.random());
    }
}
