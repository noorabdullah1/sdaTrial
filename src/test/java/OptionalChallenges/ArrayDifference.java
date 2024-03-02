package OptionalChallenges;

public class ArrayDifference {
//5. Write a Java Program that takes an array and returns the difference between the biggest and the smallest numbers.
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 8};
        int difference = findDifference(numbers);

        System.out.println("Difference between the largest and smallest numbers: " + difference);
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

