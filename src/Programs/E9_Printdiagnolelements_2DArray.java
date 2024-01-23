package src.Programs;

import java.util.Scanner;

public class E9_Printdiagnolelements_2DArray {

    public static void main(String[] args)
    {
        //print diagonal element 2D array
        /*
          0,0 0,1 0,2
          1,0 1,1 1,2
          2,0 2,1 2,2         Diagonal element   0,0 1,1 2,2
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows and columns");
        int row = sc.nextInt();
        int column = sc.nextInt();

        System.out.println("Enter the array");
        int[] [] array1 = new int[row] [column];

        for(int i=0; i<array1.length; i++)
        {
            for(int j=0; j<array1[i].length;j++)
            {
                array1[i] [j] = sc.nextInt();
            }
        }

        for(int i=0; i<array1.length; i++)
        {
            for(int j=0; j<array1[i].length;j++)
            {
                if(i == j) {
                    System.out.print(array1[i][j] +" ");
                }
            }
        }


        //Another method
        for(int i=0; i<array1.length;i++)
        {
            System.out.println(array1[i][i]);
        }



    }
}
