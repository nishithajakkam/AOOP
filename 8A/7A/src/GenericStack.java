public interface GenericStack<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}
