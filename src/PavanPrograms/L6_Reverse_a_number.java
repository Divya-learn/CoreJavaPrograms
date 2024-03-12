package src.PavanPrograms;

import java.util.Scanner;

public class L6_Reverse_a_number {

    public static void main(String[] args)
    {
        //Ip:- 1234 Op:- 4321

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1;
        while(num>0) {

            num1 = num % 10;
            num =  num /10;
            System.out.print(num1);
        }
    }
}
