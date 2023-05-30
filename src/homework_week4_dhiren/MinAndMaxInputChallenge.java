package homework_week4_dhiren;

import java.util.Scanner;


public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // Clear the newline character from the input buffer
        }

        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        }

        scanner.close();
    }
}
