package src.basic004;
import java.util.Scanner;

public class Lab027_GradeCalculator {
    public static void main(String[] args)
    {
        /*
        1.Input from the user
        2.Find the basic logic and write rough code
        3.write the real code
        4.Debug the code
        5.Fix the code and final it
         */
        /* Write a program that calculates and displays the letter grade for a given numerical score
        (eg A,B,C,D or F) based on the following
          A: 90-100
          B: 80-89
          C: 70-79
          D: 60-69
          F: 0-59
         */
        Scanner marks =new Scanner(System.in);
        System.out.println("Enter the marks");
        int score = marks.nextInt();

        if(score>=90 && score <=100)
        {
            System.out.println("A");
        }
        else if(score>=80 && score <=89)
        {
            System.out.println("B");
        }
        else if(score>=70 && score <=79)
        {
            System.out.println("C");
        }else if(score>=60 && score <=69)
        {
            System.out.println("D");
        }else
        {
            System.out.println("F");
        }

    }
}
