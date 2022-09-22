// https://www.hackerrank.com/challenges/equal-stacks/problem
// https://www.hackerrank.com/challenges/equal-stacks/problem
// You have three stacks of cylinders where each cylinder has the same diameter,
// but they may vary in height. You can change the height of a stack
// by removing and discarding its topmost cylinder any number of times.
//  Find the maximum possible height of the stacks such that
//  all of the stacks are exactly the same height.
//  This means you must remove zero or more cylinders from the top of zero
//  or more of the three stacks until they are all the same height,
//  then return the height.
//  Example
//  h1 = [1,2,1,1]
//  h2 = [1,1,2]
//  h3 = [1,1]
// There are 4,3 and 2 cylinders in the three stacks,
// with their heights in the three arrays.
// Remove the top 2 cylinders from h1  (heights = [1, 2]) and
// from h2 (heights = [1, 1]) so that the three stacks all are 2 units tall.
// Return 2 as the answer.
// Note: An empty stack is still a stack.

// Function Description
//
//         Complete the equalStacks function in the editor below.
//
//         equalStacks has the following parameters:
//
//         int h1[n1]: the first array of heights
//         int h2[n2]: the second array of heights
//         int h3[n3]: the third array of heights
//         Returns
//
//         int: the height of the stacks when they are equalized


// STDIN       Function
//         -----       --------
//         5 3 4       h1[] size n1 = 5, h2[] size n2 = 3, h3[] size n3 = 4
//         3 2 1 1 1   h1 = [3, 2, 1, 1, 1]
//         4 3 2       h2 = [4, 3, 2]
//         1 1 4 1     h3 = [1, 1, 4, 1]


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class EqualStacks1 {

    private static int sumStack(Stack<Integer> stk) {
        int sumTemp = 0;
        for (Integer obj : stk) {

            sumTemp = sumTemp + obj;
        }
        // System.out.println(sumTemp);
        return sumTemp;
    }

    public static int checkStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Collections.reverse(h1);
        Collections.reverse(h2);
        Collections.reverse(h3);

        Stack<Integer> stk1 = new Stack<>();
        stk1.addAll(h1);
        Stack<Integer> stk2 = new Stack<>();
        stk2.addAll(h2);
        Stack<Integer> stk3 = new Stack<>();
        stk3.addAll(h3);
        // Stack<Integer> stkReference1;
        // Stack<Integer> stkReference2;
        // Stack<Integer> stkReference3;
        ArrayList<Stack<Integer>> arr = new ArrayList<>();
        arr.add(stk1);
        arr.add(stk2);
        arr.add(stk3);

        Collections.sort(arr, new Comparator<Stack<Integer>>() {
            public int compare(Stack<Integer> stkA, Stack<Integer> stkB) {
                return Integer.compare(stkA.size(),
                                       stkB.size());
            }
        });

        // SHOW STACKS
        // for (Stack<Integer> sa : arr) {
        //     System.out.println(sa.toString());
        // }


        int maxHeight = 0;
        // boolean check1 = false;
        // boolean check2 = false;
        //
        int pointer = 1;

        int sumaStk1 = sumStack(arr.get(0));
        int sumaStk2 = sumStack(arr.get(1));
        int sumaStk3 = sumStack(arr.get(2));


        while (pointer < arr.size()) {
            // if (sumStack(stk1) == sumStack(stk2) && sumStack(stk2) == sumStack(stk3)) {
            //     maxHeight = sumStack(stk1);
            //
            // }
            int sumRef = sumStack(arr.get(0));
            int sumIter = sumStack(arr.get(pointer));

            while (sumStack(arr.get(pointer)) > sumRef) {
                arr.get(pointer).pop();
            }

            if (sumStack(arr.get(pointer)) == sumRef) {
                pointer++;
            }
            else {
                arr.get(0).pop();
            }

        }


        System.out.println(sumStack(stk1));
        System.out.println(sumStack(stk2));
        System.out.println(sumStack(stk3));
        if (stk1.isEmpty()) {
            return 0;
        }
        return sumStack(stk1);
    }

    public static void main(String[] args) {
        EqualStacks1 myChequer = new EqualStacks1();
        // EJEMPLO #1
        // List<Integer> h1 = Arrays.asList(1, 1, 1, 2, 3);
        // List<Integer> h2 = Arrays.asList(2, 3, 4);
        // List<Integer> h3 = Arrays.asList(1, 1, 4, 1);

        // EJEMPLO #2
        List<Integer> h1 = Arrays.asList(3, 2, 1, 1, 1);
        List<Integer> h2 = Arrays.asList(4, 3, 2);
        List<Integer> h3 = Arrays.asList(1, 1, 4, 1);

        // System.out.println(h1.toString());
        // System.out.println(h2.toString());
        // System.out.println(h3.toString());
        // System.out.println("------------");
        myChequer.checkStacks(h1, h2, h3);
    }

    //
    // public static void main(String[] args) throws IOException {
    //     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //     BufferedWriter bufferedWriter = new BufferedWriter(
    //             new FileWriter(System.getenv("OUTPUT_PATH")));
    //
    //     String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    //
    //     int n1 = Integer.parseInt(firstMultipleInput[0]);
    //
    //     int n2 = Integer.parseInt(firstMultipleInput[1]);
    //
    //     int n3 = Integer.parseInt(firstMultipleInput[2]);
    //
    //     List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
    //                              .map(Integer::parseInt)
    //                              .collect(toList());
    //
    //     List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
    //                              .map(Integer::parseInt)
    //                              .collect(toList());
    //
    //     List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
    //                              .map(Integer::parseInt)
    //                              .collect(toList());
    //
    //     int result = EqualStacks1.checkStacks(h1, h2, h3);
    //
    //     bufferedWriter.write(String.valueOf(result));
    //     bufferedWriter.newLine();
    //
    //     bufferedReader.close();
    //     bufferedWriter.close();
    // }

}
