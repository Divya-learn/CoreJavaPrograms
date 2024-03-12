package src.PavanPrograms;

import java.util.Scanner;

public class L8_Print_Even_and_Odd_numbers_in_array {

    public static void main(String[] args)
    {
        //Ip: 6
        // {1,2,3,4,5,6}
        // Op: Even = 3 Odd = 3

        Scanner sc = new Scanner(System.in);
        int a[]= new int[sc.nextInt()];
        int Ecount =0, Ocount=0;

        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<a.length; i++)
        {
            if(a[i] % 2 ==0)
            {
               Ecount++;
            }
            else {
                Ocount++;
            }
        }

        System.out.println("Even "+ Ecount);
        System.out.println("Odd "+ Ocount);
    }
}
