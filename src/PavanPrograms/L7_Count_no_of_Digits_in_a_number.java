package src.PavanPrograms;

import java.util.Scanner;

public class L7_Count_no_of_Digits_in_a_number {

    public static void main(String[] args)
    {
        //Ip: 423424 Op: 6

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1;
        int count =0;

        while(num>0)
        {
            num1 = num %10;
            if(num1 !=0)
            {
                count++;
            }

            num =  num/10;

        }
        System.out.println(count);

    }
}
