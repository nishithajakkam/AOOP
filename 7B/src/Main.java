public class Main {
    public static void main(String[] args) {
        // Test with Integers
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.add(10);
        intQueue.add(5);
        intQueue.add(20);
        System.out.println("PriorityQueue Peek (Integer): " + intQueue.peek());
        System.out.println("PriorityQueue Remove (Integer): " + intQueue.remove());
        System.out.println("PriorityQueue Peek After Remove (Integer): " + intQueue.peek());

        // Test with Doubles
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.add(15.5);
        doubleQueue.add(10.1);
        doubleQueue.add(20.2);
        System.out.println("PriorityQueue Peek (Double): " + doubleQueue.peek());
        System.out.println("PriorityQueue Remove (Double): " + doubleQueue.remove());
        System.out.println("PriorityQueue Peek After Remove (Double): " + doubleQueue.peek());

        // Test with Strings
        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>();
        stringQueue.add("banana");
        stringQueue.add("apple");
        stringQueue.add("pear");
        System.out.println("PriorityQueue Peek (String): " + stringQueue.peek());
        System.out.println("PriorityQueue Remove (String): " + stringQueue.remove());
        System.out.println("PriorityQueue Peek After Remove (String): " + stringQueue.peek());
    }
}
