package src.basic007;

import java.util.Scanner;

public class Lab059_Arrayconceptbasic {

    public static  void main(String[] args)
    {
        //we can initialize the array two types

 /*    int[] marks = {56,77,89,45,67,89,34};

        marks[1] =9;  //we can change the value of array

      //  System.out.println(marks[1]);

       for(int i=0; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        for(int i=marks.length-1; i>=0;i--)
        {
            System.out.println(marks[i]);
        }

        int[] marks1 = new int[5];
     //   int[] marks = new int[];  -->invalid
        marks1[0] = 56;
        marks1[1] = 78;
        marks1[2] = 34;
        marks1[3] = 98;
        marks1[4] = 78;


        //we can change the value
        marks1[3] = 0;

        for(int i=0;i<marks1.length;i++)
        {
            System.out.println(marks1[i]);
        }

        //using final keyword

        final String[] words = new String[4]; //final is applied only on here i.e length can't be changed.
        words[0] = "Book";  //values can be changed
        words[1] = "Pencil";
        words[2] = "Box";
        words[3] = "Lap";
        words[1] = "Desktop";


        for(int i=0; i<words.length;i++)
        {
            System.out.println(words[i]);
        }

        final String[] sen = {"milk", "butter", "coke"};

        sen[1] = "candies";

       // final sen[1] = "candies"; can't be used
        for(int i=0; i<sen.length;i++)
        {
            System.out.println(sen[i]);
        }

        final String sen2 = "car";
        //  sen2 = "Bike";   //cant change a value from car to bike because sen2 =caris final variable
*/

        //Taking input from user by array

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] array = new int[num];

        for(int i=0; i<num;i++)
        {
            array[i] = sc.nextInt();
        }

        for(int i=0; i<num;i++)
        {
            System.out.println(array[i]);
        }






    }
}
