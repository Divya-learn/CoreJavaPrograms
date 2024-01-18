package src.OOPS001;

public class Lab004_Returntypesinjava {

    public static void main(String[] args) {
        demo();  //calling the function
        demo("Divya");

        int d = demo(5, 6);
        System.out.println(d);

        float d1 = demo(5, 6);
        System.out.println(d1);
    }

    //void --> does not return anything
    static void demo() // no arguments
    {
        System.out.println("hello");
    }

    static void demo(String a)  //passing the arguments
    {
        System.out.println("hello" + a);
    }

    //int ---> returns something  we can use all primitive data types

    static int demo(int a, int b) { // we can have int, short, long, float, double, char, byte, boolean

        return a + b;
    }

    static float demo(float a, float b) {
        return a + b;

    }

    //reference types   -->String

    static String demo1()
    {
        return "Hi";
    }

}