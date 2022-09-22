//---------------------------------------------------------------------------
// StackBaseArrayBounded.java
// Implements StackInterface using an array to hold stack elements.
//
// Two constructors are provided: one that creates an array of a default size
// and one that allows the calling program to specify the size.
// ---------------------------------------------------------------------------


public class StackBaseArrayBounded<T> implements StackInterface1<T> {
    protected final int DEFCAP = 100; // default capacity
    protected T[] elements;    // holds stack elements
    protected int topIndex = -1; // index of top element in stack

    public StackBaseArrayBounded(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    public StackBaseArrayBounded() {
        elements = (T[]) new Object[DEFCAP];
    }


    public static void main(String[] args) {

    }


    public void push(T element) throws StackOverflowException {
        if (isFull())
            throw new StackOverflowException("Push attempted on a full stack.");
        else {
            topIndex++;
            elements[topIndex] = element;
        }
    }


    public void pop() throws StackUnderflowException {
        if (isEmpty())
            throw new StackUnderflowException("Pop attempted on empty stack.");
        else {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    public T top() throws StackUnderflowException {

        T topOfStack = null;
        if (isEmpty())
            throw new StackUnderflowException("Top attempted on empty stack.");
        else
            topOfStack = elements[topIndex];
        return topOfStack;
    }


    // Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty() {
        return (topIndex == -1);

    }

    // Returns true if this stack is full, otherwise returns false.
    public boolean isFull() {
        return (topIndex == (elements.length - 1));
    }


}
