import java.util.Arrays;


// THIS IMPLEMENTATION OF THE STACK BASED IN ARRAY


public class StackBaseArray {
    int _capacity = 10;
    int arr[];// new int[capacity];
    int pointer = -1;

    StackBaseArray() {
        arr = new int[_capacity];
    }

    StackBaseArray(int capacity) {
        _capacity = capacity;
        arr = new int[_capacity];
    }

    void push(int data) {
        arr[++pointer] = data;
        System.out.println(Arrays.toString(arr));

    }


    int size() {
        return pointer + 1;
    }

    int peek() throws Exception {
        if (pointer < 0) {
            throw new Exception();
        }
        return arr[pointer];
    }

    int pop() throws Exception {
        if (pointer < 0) {
            throw new Exception();
        }
        int popData = arr[pointer];
        arr[pointer] = 0;// Integer.MIN_VALUE;
        pointer = pointer - 1;
        System.out.println(Arrays.toString(arr));
        return popData;
    }

    public static void main(String[] args) {
        StackBaseArray myStack = new StackBaseArray(20);
        // myStack.push(2);
        // myStack.push(7);
        // myStack.push(5);
        myStack.push(12);
        System.out.println("current size of the stack : " + myStack.size());
        try {
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            // System.out.println(myStack.pop());
            // System.out.println(myStack.pop());

            System.out.println(myStack.peek());
            // System.out.println(myStack.peek());
        }
        catch (Exception e) {
            System.out.println("STACK EMPTY ");
        }


        //
        // System.out.println("current size of the stack : " + myStack.size());
    }
}
