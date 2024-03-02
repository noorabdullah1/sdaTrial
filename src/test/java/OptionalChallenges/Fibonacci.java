package OptionalChallenges;
public class Fibonacci {
    public static void main(String[] args) {
        int limit = 11235811;
        printFibonacciNumbers(limit);
    }

    public static void printFibonacciNumbers(int limit) {
        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci numbers up to " + limit + ":");

        System.out.print(num1 + " ");

        while (num2 <= limit) {
            System.out.print(num2 + " ");

            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        System.out.println();
    }
}