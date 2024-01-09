package src.Programs;

import java.util.Scanner;

public class E3_Sumofdigits {

    public static void main(String[] args)
    {
        //5678= 5+6+7+8 = 26

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();
        int num1;
        int sum=0;
        while(num>0)
        {
            num1 = num % 10; // 5678 -->8   567 -->7   56-->6   5
             num = num /10; //567      56           5      0
           // System.out.println(num1); //op   8765
            sum = sum +num1;

        }

        System.out.println(sum); //op 26
        

    }
}
