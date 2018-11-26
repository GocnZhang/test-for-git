import java.util.Scanner;

public class Problem1 {
    //Fibonacci
    private static int getValue(int n) {
        if (n < 1) {
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {
            return getValue(n - 1) + getValue(n - 2);
        }
    }

    public static void main(String [] args) {
        System.out.println("print a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getValue(n));
        scanner.close();

    }
}
