package homework_week4_dhiren;

import java.util.Scanner;

public class PalindromeNumber {

       /** public static void main(String[] args) {
            System.out.println(isPalindrome(-1221));  // Output: true
            System.out.println(isPalindrome(707));    // Output: true
            System.out.println(isPalindrome(11212));  // Output: false
        }

        public static boolean isPalindrome(int number) {
            int reverse = 0;
            int originalNumber = number;

            while (number != 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number /= 10;
            }

            return originalNumber == reverse;
        }*/


       public static boolean isPalindrome(int number) {
           if (number < 0) {
               return false;
           }

           int reverse = 0;
           while (number > 0) {
               reverse *= 10;
               reverse += number % 10;
               number /= 10;
           }

           return number == reverse;
       }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212)); //

// Call the method with a user-input number
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("Is " + userInput + " a palindrome? " + isPalindrome(userInput));
    }
}

