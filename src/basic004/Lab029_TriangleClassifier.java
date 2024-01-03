package src.basic004;
import java.util.Scanner;

public class Lab029_TriangleClassifier {
    public static void main(String[] args)
    {
        /*
        //Triangle classifier
 Write a program that classifies a triangle based on its side lengths. Given three input
 values representing the lengths of the sides.determine
        if the triangle is equilateral (all sides are equal)
        isosceles(exactly two sides are equal) or
        scalene(no sides are equal)
        Use an if-else statement to classify the triangle
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1:");
        int side1=sc.nextInt();
        System.out.println("Enter side2:");
        int side2=sc.nextInt();
        System.out.println("Enter side3:");
        int side3=sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side3 == side1))
        {
            System.out.println("The triangle is equilateral");
        }
        else if((side1 == side2) || (side2 == side3) || (side3 == side1))
        {
            System.out.println("The triangle is isosceles");
        }
        else {
            System.out.println("The triangle is no sides are equal");
        }


    }
}
