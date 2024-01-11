package src.Programs;

import java.util.Scanner;

public class E5_Takeinputfromuserbyarray {

    public static void main(String[] args)
    {
        //Take input from user using array

        Scanner sc= new Scanner(System.in);
        //Enter the five subject marks
        System.out.println("Enter how many subject marks");
        int num = sc.nextInt();
        System.out.println("Enter the subject marks");
        int[] marks = new int[num];
        int sum =0;

        //enter num (or) marks.length
        //we can use for loop or while loop
        for(int i=0; i<marks.length;i++)
        {
            marks[i] = sc.nextInt();
            sum =sum + marks[i];
        }


      //  for(int i=0;i<marks.length;i++)
        int i=0;
        while(i<marks.length)
        {
            if(marks[i] == 9)
            {
                System.out.println("FAIL");
            }
            System.out.println(marks[i]);
            i++;
        }


        System.out.println(sum);





    }
}
