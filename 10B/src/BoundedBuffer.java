import java.util.LinkedList;
import java.util.Queue;

class BoundedBuffer {
    private final int capacity = 10; // Max capacity of the buffer
    private final Queue<Integer> buffer = new LinkedList<>();

    // Method to add items to the buffer (producer)
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full, producer waiting...");
            wait(); // Wait until there's space in the buffer
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify consumer that an item is available
    }

    // Method to remove items from the buffer (consumer)
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty, consumer waiting...");
            wait(); // Wait until there's an item to consume
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify producer that space is available
        return item;
    }
}
