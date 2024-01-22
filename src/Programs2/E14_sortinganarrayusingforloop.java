package src.Programs2;

import java.util.Scanner;

public class E14_sortinganarrayusingforloop {

    public static void main(String[] args)
    {
        //Sorting an array     {50,20,40,10,100}   after sorting 10 20 40 50 100

        System.out.println("Enter any five elements");

        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        int temp;

        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] =temp;

                }

            }
            System.out.println(array[i]);
        }
    }
}
