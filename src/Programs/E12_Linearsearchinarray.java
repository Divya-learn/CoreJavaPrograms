package src.Programs;

import javax.swing.*;
import java.util.Scanner;

public class E12_Linearsearchinarray {

    public static void main(String[] args)
    {
        //Find the element in array (linear search)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 6 number");
        int[] array = new int[6];

        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the element which number need to search");
        int searchelement = sc.nextInt(); //50

        boolean status =false;       //10 20 30 40 70 50

        for(int i=0;i<array.length;i++)
        {
            if(array[i] == searchelement)
            {
                System.out.println("Match found"+array[i]);
                status = true;
                break;
            }


        }

        if(status == false)
        {
            System.out.println("not Match found");
        }



    }
}
