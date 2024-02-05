package src.oops001;

public class Lab001Methodsfunctions {

    public static void main(String[] args)
    {
     int c=  sum(3,5);                 //function call    3 and 5 are arguments
     System.out.println(c); //Two arguments

     int c1 = sum(4);   //One arguments
        System.out.println(c1);

     int c3 = sum();        //No arguments
     System.out.println(c3);

     sayhello();
    }

    static int sum(int a, int b)            //function declaration
    {
        return a+b;                       //function definition
    }

    static int sum(int a)
    {
        return a;
    }

    static int sum()
    {
        return 99;
    }

    static void sayhello()
    {
        System.out.println("Yes");
    }
}
