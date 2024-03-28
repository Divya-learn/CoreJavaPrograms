package src.PavanPrograms;

import java.util.Scanner;

public class L15_Perfect_Square {

    public static void main(String[] args){

        //Perfect Square
        //8100  -> 90*90 = 8100 (perfect square)
        //49    -> 7*7   =49 (perfect square)
        //24    -> 6*4   =24 (not a perfect square)

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int num1 = (int)Math.sqrt(num);

        int num2 = (int)Math.pow(num1,2);

        if(num2 == num)
        {
            System.out.println("Perfect square");
        }
        else{
            System.out.println("Not a perfect square");
        }




    }
}
