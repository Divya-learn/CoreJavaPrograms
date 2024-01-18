package src.Programs;

import java.util.Scanner;

public class E8_swappingtwonumbers {

    public static void main(String[] args)
    {
        //swapping two numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("swap of two number is "+ num1 +" "+ num2);


        //swapping two numbers without adding two numbers

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the two numbers");
        int n1 = sc1.nextInt();
        int n2 = sc1.nextInt();

        n1 = n1 + n2;   // a= a+b; b=a-b; a=a-b;  a= 10, b=20
        n2 = n1 - n2;   //  a= 30  b=20    a=10
        n1 = n1 - n2;

        System.out.println("swap without third num "+ n1 +" "+ n2);


        //another method without using third variable --> if we give any one of the value as (zero) it will not work

        int a =44;
        int b =23;

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println(a+" "+b);

        //bitwise xor (not recommended)

        /*
        a = a^b;
        b = a^b;
        a= a^b;
         */



    }
}
