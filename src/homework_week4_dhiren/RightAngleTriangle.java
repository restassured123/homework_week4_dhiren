package homework_week4_dhiren;

public class RightAngleTriangle {


    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle

        // Loop through rows
        for (int i = 1; i <= rows; i++) {
            // Loop through columns for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
