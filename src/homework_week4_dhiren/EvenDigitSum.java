package homework_week4_dhiren;



public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        // Check yf the number is negative.
        if (number < 0){
            return -1;
        }
        // Initialize the sum of even digits.
        int sum = 0;

        // Iterate over the digits of the number.
        while (number > 0) {
            // Get the last digit of the number.
            int digit = number % 10;

            // If the digit is even, add it to the sum.
            if (digit % 2 == 0) {
                sum += digit;
            }

            // Remove the last digit from the number.
            number /= 10;
        }

        // Return the sum of even digits.
        return sum;
    }

    public static void main(String[] args) {
        // Call the getEvenDigitSum method and print the result.
        System.out.println(getEvenDigitSum(123456789)); // 20
        System.out.println(getEvenDigitSum(252)); // 4
        System.out.println(getEvenDigitSum(-22)); // -1
    }


}
