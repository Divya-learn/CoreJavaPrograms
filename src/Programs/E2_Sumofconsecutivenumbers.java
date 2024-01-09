package src.Programs;

import java.util.Scanner;

public class E2_Sumofconsecutivenumbers {

    public static void main(String[] args)
    {
        //5 --> 5+4+3+2+1

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum=0;

        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of digits is: "+ sum);
    }
}
