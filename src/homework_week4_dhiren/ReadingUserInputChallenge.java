package homework_week4_dhiren;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int counter =1;
        while (counter <= 10){
            System.out.println("Enter number #1 :" );
            if (sc.hasNextInt()){
                int number = sc.nextInt();
                sum+= number;
                counter++;
            }else {
                System.out.println("Invalid Number");
            }
            sc.nextLine();   // Clear the newline character from the input buffer
        }
        System.out.println("The sum of the numbers is: " + sum);
        sc.close();
    }

}
