package OptionalChallenges;

public class StringReversal {
//1. Write a Java Program that reverses a string
    public static void main(String[] args) {
        String input = "Hello, World!";
        System.out.println(input);
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

