package src.Programs;

import java.util.Scanner;

public class E10_Primenumber {

    public static void main(String[] args)
    {
        //prime number --> number divisible by 1 and itself

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       /* if(num % 1 ==0 && num % num ==0)
        {
            System.out.println("prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
        */

        for(int i=2;i<=4;i++)
        {
            if(num % i ==0)
            {
                System.out.println("prime number");
            }

            else {
                System.out.println("Not a prime number");
            }
        }

    }
}
