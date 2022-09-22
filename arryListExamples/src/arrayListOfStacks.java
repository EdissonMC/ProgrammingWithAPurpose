import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;


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


public class arrayListOfStacks {

    private static int sumStack(Stack<Integer> stk) {
        int sumTemp = 0;
        for (Integer obj : stk) {

            sumTemp = sumTemp + obj;
        }
        // System.out.println(sumTemp);
        return sumTemp;
    }

    public static void checkStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Collections.reverse(h1);
        // Collections.reverse(h2);
        // Collections.reverse(h3);

        Stack<Integer> stk1 = new Stack<>();

        ListIterator listIterator = h1.listIterator(h1.size());
        while (listIterator.hasPrevious()) {
            // System.out.println(listIterator.previous());
            stk1.push((int) listIterator.previous());
        }

        // stk1.addAll(h1);

        Stack<Integer> stk2 = new Stack<>();

        ListIterator listIterator2 = h2.listIterator(h2.size());
        while (listIterator2.hasPrevious()) {
            // System.out.println(listIterator.previous());
            stk2.push((int) listIterator2.previous());
        }


        Stack<Integer> stk3 = new Stack<>();

        ListIterator listIterator3 = h3.listIterator(h3.size());
        while (listIterator3.hasPrevious()) {
            // System.out.println(listIterator.previous());
            stk3.push((int) listIterator3.previous());
        }

        // INSERT MANY STACKS INSIDE AN ARRAY
        ArrayList<Stack<Integer>> arr = new ArrayList<>();
        arr.add(stk1);
        arr.add(stk2);
        arr.add(stk3);

        // Collections.sort(arr, new Comparator<Stack<Integer>>() {
        //     public int compare(Stack<Integer> stkA, Stack<Integer> stkB) {
        //         return Integer.compare(stkA.size(),
        //                                stkB.size());
        //     }
        // });

        // SHOW STACKS
        for (Stack<Integer> sa : arr) {
            System.out.println(sa.toString());
        }


    }


    public static void main(String[] args) {

        // System.out.println(EqualStacks3.checkMin(3, 4, 1));

        // EJEMPLO #1  R/7
        List<Integer> h1 = Arrays.asList(1, 1, 1, 2, 3);
        List<Integer> h2 = Arrays.asList(2, 3, 4);
        List<Integer> h3 = Arrays.asList(1, 1, 4, 1);

        // EJEMPLO #2  R/5
        // List<Integer> h1 = Arrays.asList(3, 2, 1, 1, 1);
        // List<Integer> h2 = Arrays.asList(4, 3, 2);
        // List<Integer> h3 = Arrays.asList(1, 1, 4, 1);

        // System.out.println(h1.toString());
        // System.out.println(h2.toString());
        // System.out.println(h3.toString());
        // System.out.println("------------");
        arrayListOfStacks.checkStacks(h1, h2, h3);
    }


}
