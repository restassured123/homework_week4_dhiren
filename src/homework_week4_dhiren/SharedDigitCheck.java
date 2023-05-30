package homework_week4_dhiren;

public class SharedDigitCheck {
        public static void main(String[] args) {
            System.out.println(hasSharedDigit(12, 23));   // Output: true
            System.out.println(hasSharedDigit(9, 99));    // Output: false
            System.out.println(hasSharedDigit(15, 55));   // Output: true
        }

        public static boolean hasSharedDigit(int number1, int number2) {
            if (!isValidRange(number1) || !isValidRange(number2)) {
                return false; // Invalid range: number(s) not within 10-99
            }

            int digit1;
            int digit2;

            while (number1 > 0) {
                digit1 = number1 % 10;
                int tempNumber2 = number2;

                while (tempNumber2 > 0) {
                    digit2 = tempNumber2 % 10;

                    if (digit1 == digit2) {
                        return true; // Shared digit found
                    }

                    tempNumber2 /= 10;
                }

                number1 /= 10;
            }

            return false; // No shared digit found
        }

        public static boolean isValidRange(int number) {
            return number >= 10 && number <= 99;
        }
    }
