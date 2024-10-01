class Producer implements Runnable {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int messageCount = 0;
        try {
            while (messageCount < 10) { // Produce 10 messages
                String message = "Message " + ++messageCount;
                buffer.produce(message);
                Thread.sleep(500); // Simulate time taken to produce a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
