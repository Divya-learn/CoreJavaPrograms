package src.basic004;
import java.util.Scanner;
public class Lab025_Takeinputfromuser {

    public static void main(String[] args70)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        if(num1 > num2)
        {
            System.out.println("Maximum is "+num1);
        }
        else
        {
            System.out.println("Maximum is"+num2);
        }



    }
}
