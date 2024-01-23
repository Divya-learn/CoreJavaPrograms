package src.Programs2;

import java.util.Scanner;

public class E15_Occurence_of_an_element_inarray {

    public static void main(String[] args)
    {
        //Occurence of an element    10 20 30 10 10  --> 10  3

        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        int count =0;

        for(int i=0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i] == array[j])

                    count++;

            }

        }
        System.out.println(count);
    }
}
