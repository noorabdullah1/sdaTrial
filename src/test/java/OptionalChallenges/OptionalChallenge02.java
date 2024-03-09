package OptionalChallenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OptionalChallenge02 {
    public static void main(String[] args) {
//6. Write a Java Program that checks if a String is palindrome or not. (when you reverse it, you need to get the same string)
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                if (isPalindrome(input)) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }

//7. Write a Java Program that checks if given integer is Armstrong number or not (The number whose sum of the cubes of its digits is equal to itself: 153 -> 1^3 + 5^3 + 3^3 -> 1 + 125 + 27)
//8. Write a Program that removes the duplicate elements from given list
                List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("D");
        letters.add("E");

                // Create a new list without duplicates
                List<String> lettersWithoutDuplicates = new ArrayList<>();

                for (String letter : letters) {
                    if (!lettersWithoutDuplicates.contains(letter)) {
                        lettersWithoutDuplicates.add(letter);
                    }
                }

                // Print the list without duplicates
                System.out.println("List without duplicates:");
                for (String letter : lettersWithoutDuplicates) {
                    System.out.println(letter);
                }
            }



    public static boolean isPalindrome(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equalsIgnoreCase(reversed);
    }
}







