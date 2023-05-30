package homework_week4_dhiren;

public class DigitSumChallenge04 {
    public static void main(String[] args) {
        // Testing the sumDigits method
        System.out.println(sumDigits(125));  // Output: 8
        System.out.println(sumDigits(1));    // Output: -1
        System.out.println(sumDigits(10));   // Output: 1
        System.out.println(sumDigits(-125)); // Output: -1
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1; // Invalid value: less than 10
        }

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}

