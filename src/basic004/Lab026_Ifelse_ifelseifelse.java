package src.basic004;
import java.util.Scanner;
public class Lab026_Ifelse_ifelseifelse {
    public static void main(String[] args)
    {
        //if else
        if(true)
        {
            System.out.println("condition is true");
        }
        else {
            System.out.println("condition is false");
        }


        //We can use only if condition alone
        if(true)
        {
            System.out.println("Condition is true");
        }

        //if elseif else
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>20)
        {
            System.out.println("Output is"+a);
        }
        else if(a>30) //Note:- elseif also has a condition
        {
            System.out.println("Output is"+a);
        }
        else {
            System.out.println("Output is"+a);
        }










       }
    }

