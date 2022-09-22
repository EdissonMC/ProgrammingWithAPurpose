import java.util.ArrayList;

// THIS IMPLEMENTATION OF THE STACK BASED IN ARRAYLIST
// IN USING ARRAYLIST FOR THE JAVA API


public class StackBaseArrayList {
    int _capacity = 10;
    int arr[];// new int[capacity];
    ArrayList<Integer> arr1 = new ArrayList<>();
    
    int pointer = -1;

    StackBaseArrayList() {
        arr = new int[_capacity];

    }

    StackBaseArrayList(int capacity) {
        _capacity = capacity;
        arr = new int[_capacity];
    }

    void push(int data) {
        arr1.add(data);
        pointer++;

        // arr[++pointer] = data;
        System.out.println(arr1.toString());

    }


    int size() {
        return arr1.size();
    }

    int peek() throws Exception {
        if (pointer < 0) {
            throw new Exception();
        }
        return arr1.get(pointer);
    }

    int pop() throws Exception {
        if (pointer < 0) {
            throw new Exception();
        }

        int popData = arr1.get(pointer);
        arr1.remove(pointer);
        // arr1.add(pointer, 0) = 0;// Integer.MIN_VALUE;
        pointer = pointer - 1;
        System.out.println(arr1.toString());
        return popData;
    }

    public static void main(String[] args) {
        StackBaseArrayList myStack = new StackBaseArrayList(20);
        // myStack.push(2);
        myStack.push(7);
        myStack.push(5);
        myStack.push(12);
        System.out.println("current size of the stack : " + myStack.size());
        try {
            System.out.println(" removed -> " + myStack.pop());
            System.out.println(" removed -> " + myStack.pop());
            // System.out.println(" removed -> " + myStack.pop());
            // System.out.println(" removed -> " + myStack.pop());
            // System.out.println(myStack.pop());
            // System.out.println(myStack.pop());
            // System.out.println(myStack.pop());

            System.out.println(" peek -> " + myStack.peek());
            System.out.println(" peek -> " + myStack.peek());
            // System.out.println(myStack.peek());
        }
        catch (Exception e) {
            System.out.println("ERROR STACK EMPTY ");
        }


        //
        // System.out.println("current size of the stack : " + myStack.size());
    }
}
