import java.util.ArrayList;

public class StackBaseArrayListGeneric<E> {
    int _capacity = 10;

    ArrayList<E> arr1 = new ArrayList<>();

    int pointer = -1;


    void push(E data) {
        arr1.add(data);
        pointer++;

        // arr[++pointer] = data;
        System.out.println(arr1.toString());

    }


    int size() {
        return arr1.size();
    }

    E peek() throws Exception {
        if (pointer < 0) {
            throw new Exception();
        }
        return arr1.get(pointer);
    }

    E pop() throws Exception {
        if (pointer < 0) {
            throw new Exception();
        }

        E popData = arr1.get(pointer);
        arr1.remove(pointer);
        // arr1.add(pointer, 0) = 0;// Integer.MIN_VALUE;
        pointer = pointer - 1;
        System.out.println(arr1.toString());
        return popData;
    }

    boolean isEmpty() {
        return pointer < 0;
    }

    public static void main(String[] args) {

        // WITH INTEGERS
        // StackBaseArrayListGeneric<Integer> myStack = new StackBaseArrayListGeneric<Integer>();
        // myStack.push(7);
        // myStack.push(5);
        // myStack.push(12);
        // System.out.println("current size of the stack : " + myStack.size());
        // try {
        //     System.out.println(" removed -> " + myStack.pop());
        //     System.out.println(" removed -> " + myStack.pop());
        //     System.out.println(" peek -> " + myStack.peek());
        //     System.out.println(" peek -> " + myStack.peek());
        // }
        // catch (Exception e) {
        //     System.out.println("ERROR STACK EMPTY ");
        // }

        // WITH STRINGS
        StackBaseArrayListGeneric<String> myStack = new StackBaseArrayListGeneric<>();
        myStack.push("H");
        myStack.push("O");
        myStack.push("L");
        myStack.push("A");

        System.out.println("current size of the stack : " + myStack.size());
        try {
            System.out.println(" removed -> " + myStack.pop());
            System.out.println(" removed -> " + myStack.pop());
            System.out.println(" peek -> " + myStack.peek());
            System.out.println(" peek -> " + myStack.peek());

            System.out.println(" removed -> " + myStack.pop());
            // System.out.println(" removed -> " + myStack.pop());
            System.out.println("is empty ? " + myStack.isEmpty());

        }
        catch (Exception e) {
            System.out.println("ERROR STACK EMPTY ");
        }


    }
}
