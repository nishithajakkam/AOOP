import java.util.LinkedList;

public class LinkedListStack<T> implements GenericStack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    @Override
    public void push(T item) {
        stack.addFirst(item);
    }

    @Override
    public T pop() {
        return stack.removeFirst();
    }

    @Override
    public T peek() {
        return stack.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
