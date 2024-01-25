package src.OOPS002class_object;

public class Functions {

    public static void main(String[] args)

    {
        hello();   //directly calling the function by using function name
        int d =sum(5,5);
        System.out.println(d);
    }

    static void hello()    //This is function in case of class it is method
    {
        System.out.println("sayhello");
    }

    static int sum(int a, int b)
    {
        return a+b;
    }
}
