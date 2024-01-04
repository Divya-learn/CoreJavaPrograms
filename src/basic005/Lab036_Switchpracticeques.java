package src.basic005;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.cbrt;

public class Lab036_Switchpracticeques {

    public static void main(String[] args)
    {
        // cuberoot of (x^2 + y^2 - |z|)  take input from user use inbuilt function
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = sc.nextInt();
        double result;

        
        result = Math.pow(x,2) + Math.pow(y,2) - Math.abs(z);
        result = Math.cbrt(result);

        System.out.println(result);

        sc.close(); //Scanner stream should be closed after we are done
    }
}
