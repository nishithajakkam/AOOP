public class Main {
    public static void main(String[] args) {
        // Test LinkedListStack
        GenericStack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("LinkedListStack Peek: " + linkedListStack.peek());
        System.out.println("LinkedListStack Pop: " + linkedListStack.pop());
        System.out.println("LinkedListStack Is Empty: " + linkedListStack.isEmpty());

        // Test ArrayStack
        GenericStack<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.push("C");
        System.out.println("ArrayStack Peek: " + arrayStack.peek());
        System.out.println("ArrayStack Pop: " + arrayStack.pop());
        System.out.println("ArrayStack Is Empty: " + arrayStack.isEmpty());
    }
}
