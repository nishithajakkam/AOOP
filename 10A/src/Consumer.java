class Consumer implements Runnable {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000); // Simulate time taken to process a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
