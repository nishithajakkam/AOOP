public class NumberPrinter {

    // Method to print if divisible by 2
    public synchronized void printTwo(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2");
        }
    }

    // Method to print if divisible by 3
    public synchronized void printThree(int number) {
        if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        }
    }

    // Method to print if divisible by 4
    public synchronized void printFour(int number) {
        if (number % 4 == 0) {
            System.out.println(number + " is divisible by 4");
        }
    }

    // Method to print if divisible by 5
    public synchronized void printFive(int number) {
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        }
    }

    // Method to print if none of the above conditions are met
    public synchronized void printNumber(int number) {
        if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println(number + " is not divisible by 2, 3, 4, or 5");
        }
    }

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        // Loop to create threads for each number from 1 to 15
        for (int i = 1; i <= 15; i++) {
            final int number = i;

            // Creating separate threads for each method call
            new Thread(() -> printer.printTwo(number)).start();
            new Thread(() -> printer.printThree(number)).start();
            new Thread(() -> printer.printFour(number)).start();
            new Thread(() -> printer.printFive(number)).start();
            new Thread(() -> printer.printNumber(number)).start();
        }
    }
}
