import java.util.Arrays;

public class ArrayStack<T> implements GenericStack<T> {
    private T[] stack;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    @Override
    public void push(T item) {
        if (top == stack.length - 1) {
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        stack[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return stack[top--];
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
