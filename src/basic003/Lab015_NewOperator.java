package src.basic003;

public class Lab015_NewOperator {
    public static void main(String[] args)
    {
        int a   =10;
        int b=20;
        String name = "Hello";
        System.out.println(a+b+name); //addition 30Hello
        System.out.println(name+a+b); //Concatenation Hello1020
        System.out.println(name+(a+b));
        System.out.println("Answer is"+a+b+name); //All are concatenation 1020Hello
        System.out.println("Answer is"+(a+b)+name); //addition  30Hello
    }
}
