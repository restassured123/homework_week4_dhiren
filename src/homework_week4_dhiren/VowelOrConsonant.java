package homework_week4_dhiren;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.nextLine().toLowerCase();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char letter = input.charAt(0);

            if (isVowel(letter)) {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a single alphabet letter.");
        }

        scanner.close();
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}

