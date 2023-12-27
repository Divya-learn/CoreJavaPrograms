package src.basic002;

public class Lab011_Operator {
    public static void main(String[] args) {
        //Interview Question

        //Relational Operator

        float num1 = 10f;
        float num2 = 10f;
        // boolean bool = num1 == num2;
        System.out.println(num1 == num2);   // In case of int,float,double,char value is compared
        //  System.out.println(num1.equal(num2)); // .equal cannot be used in int
        char letter ='A';
        char letter2 ='A';
        System.out.println(letter == letter2);
      //  System.out.println(letter.equals(letter2)); cannot be used .equals in char

        System.out.println(10==10); //T
        System.out.println(10>=10); //T
        System.out.println(10<=10); //T
        System.out.println(10<10); //F
        System.out.println(10>10); //F

        System.out.println("--1----");
        System.out.println('A');
        System.out.println('A' == 65);  //Character in sop(system.out.println) is integer
                                        //ASCII  of 'A' is 65 so 65 == 65 O/P:- TRUE
        System.out.println('A' == 'A'); //o/p true

        System.out.println('a' == 97);//O/p true

        byte num = 65;
        System.out.println('A' == 65); //true

        System.out.println("---2---");

        System.out.println('A' == 65.0); // 65.0 converted into integer and 'A' is converted into integer
                                         // comparing both 65== 65 o/p true
        System.out.println('A' == 65.0f); //true

        System.out.println('A' == 65.2f); //false

       // System.out.println(true == 0); // It is not possible one is boolean & other is integer gives error

        System.out.println('A' == 65.2); //Now it is false because 65.2 becomes proper decimal

      //  System.out.println(true >= true); There is no comparison operator between two boolean gives error

    }
}
