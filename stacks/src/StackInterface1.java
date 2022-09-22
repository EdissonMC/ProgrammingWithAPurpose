public interface StackInterface1<E> {
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.
    void push(E element) throws StackOverflowException;

    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    void pop() throws StackUnderflowException;

    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element of this stack.
    E top() throws StackUnderflowException;

    // Returns true if this stack is full, otherwise returns false.
    boolean isFull();

    // Returns true if this stack is empty, otherwise returns false.
    boolean isEmpty();

}
