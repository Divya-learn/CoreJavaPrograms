package src.basic003;

public class Lab020_MaxandMinof2numbersbyTernaryOperator {

    public static void main(String[] args)
    {
        //Max & min of two numbers using ternary operator:

        int a=10;
        int b=20;

        int result = a>b ? a : b; // max of two num
        int result1= a<b ? a : b; //Min of two num

        System.out.println(result);
       System.out.println(result1);
    }
}
