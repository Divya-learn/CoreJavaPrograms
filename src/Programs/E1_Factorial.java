package src.Programs;

import java.util.Scanner;

public class E1_Factorial {

    public static void main(String[] args)
    {
        //5! =5x4x3x2x1
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num");
        int num = sc.nextInt();
        int fact=1;

        int i=1;
        while(i<=num)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial of the num is: "+fact);

        sc.close();

        /* for(int j=1;j<=num;j++)
        {
        fact=fact*j;
        }
        System.out.println(fact);
         */


    }
}
