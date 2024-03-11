package src.Hackerrankpractice;
import java.util.Scanner;

public class L1 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int num = a; // Initialize num to the initial value (a)

            for (int j = 0; j < n; j++) {
                num =num + (int)Math.pow(2, j) * b; // Update num based on the geometric progression formula
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line after printing the series for each test case
        }
        in.close();
    }
}