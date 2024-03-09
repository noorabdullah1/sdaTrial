package OptionalChallenges;

public class OptionalChallenge01 {
    public static void main(String[] args) {
        // Reverse a string
        String input = "Hello, World!";
        System.out.println(input);
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        // Swap two numbers
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        swapNumbers(num1, num2);
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Print Fibonacci numbers
        int limit = 11235811;
        printFibonacciNumbers(limit);

        // Check if a number is prime
        int number = 17;
        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Find the difference between the largest and smallest numbers in an array
        int[] numbers = {10, 5, 20, 15, 8};
        int difference = findDifference(numbers);
        System.out.println("Difference between the largest and smallest numbers: " + difference);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void swapNumbers(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
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

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findDifference(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max - min;
    }
}