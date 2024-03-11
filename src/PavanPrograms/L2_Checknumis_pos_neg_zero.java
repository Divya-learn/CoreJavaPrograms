package src.PavanPrograms;

import java.util.Scanner;

public class L2_Checknumis_pos_neg_zero {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num==0)
        {
            System.out.println("number is zero"+num);
        }
        else if(num>0)
        {
            System.out.println("number is positive"+num);
        }
        else {
            System.out.println("num is negative"+num);
        }

    }
}
