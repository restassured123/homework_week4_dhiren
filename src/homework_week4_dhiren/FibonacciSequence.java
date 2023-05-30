package homework_week4_dhiren;

public class FibonacciSequence {
    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("The first 8 Fibonacci number are: ");
        for (int i = 0; i < 8; i++){
            System.out.println(fib(i) + "  ");
        }
    }


}
