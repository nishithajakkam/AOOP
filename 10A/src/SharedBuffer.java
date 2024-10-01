import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private final int capacity = 5; // Maximum capacity of the buffer
    private final Queue<String> queue = new LinkedList<>();

    // Method to produce messages and add them to the queue
    public synchronized void produce(String message) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("Buffer is full, producer is waiting...");
            wait(); // Wait until there's space in the buffer
        }
        queue.add(message);
        System.out.println("Produced: " + message);
        notifyAll(); // Notify the consumer that a new message is available
    }

    // Method to consume messages and remove them from the queue
    public synchronized String consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Buffer is empty, consumer is waiting...");
            wait(); // Wait until there's a message to consume
        }
        String message = queue.poll();
        System.out.println("Consumed: " + message);
        notifyAll(); // Notify the producer that space is available in the buffer
        return message;
    }
}
