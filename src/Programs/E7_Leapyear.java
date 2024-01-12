package src.Programs;

import java.util.Scanner;

public class E7_Leapyear {

        public static void main(String[] args)
        {

            /*Create a program that determines whether a given year is leap year or not
            A leap year is divisible by 4, but not divisible by 100 unless it is also divisible by 400.

             */
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();

            if((year %4 ==0 && year %100 !=0 ) || year %400 ==0)
            {
                System.out.println("leap year");
            }
            else {
                System.out.println("Not a leap year");
            }

        }
}
