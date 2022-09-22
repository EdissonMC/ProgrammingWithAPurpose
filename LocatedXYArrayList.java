import java.util.ArrayList;
import java.util.Scanner;

public class LocatedXYArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value : ");
        // String str = sc.nextLine();
        int yLength = sc.nextInt();
        // System.out.println("el valor Y ingresado es: " + yLength);

        ArrayList<ArrayList<Integer>> general = new ArrayList<>();

        for (int i = 0; i < yLength; i++) {
            // int data = sc.nextInt();
            // System.out.println("leiendo : " + data);
            //
            int xLength = sc.nextInt();
            // System.out.println("el valor ingresado X es: " + xLength);

            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < xLength; j++) {
                int data = sc.nextInt();
                temp.add(data);
                // System.out.println("leyiendo : " + data);
            }

            general.add(temp);

        }
        // System.out.println(" - - - - - - - ");
        // for (ArrayList<Integer> miArray : general) {
        //     System.out.println(miArray.toString());
        // }
        // System.out.println(" - - - - - - - ");
        // System.out.println(general.get(0).get(1).toString());

        int nCoordenadas = sc.nextInt();
        // System.out.println("N coordenadas: " + nCoordenadas);
        //
        //
        for (int i = 0; i < nCoordenadas; i++) {
            // int data = sc.nextInt();
            // System.out.println("leiendo : " + data);
            //
            int yCoor = sc.nextInt();
            int xCoor = sc.nextInt();
            // System.out.printf("xCoor %d yCoor %d %n", yCoor, xCoor);
            if (yCoor >= 0 && yCoor <= general.size()) {
                if (xCoor >= 0 && xCoor <= general.get(yCoor - 1).size()) {
                    System.out.println(general.get(yCoor - 1).get(xCoor - 1).toString());
                }
                else {
                    System.out.println("ERROR!");
                }

            }


        }


    }
    // End main
}
