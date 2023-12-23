package src.basic001;

public class Lab001 {
    public static void main(String[] args){
        byte age= 10;  // -128 t0 127
        //age=128; can't store --> 128 out of range
        age =127;
        System.out.println(age+1);// o/p  --> 128   Q/A

        //age=age+1;
        System.out.println(age);// can't able to print because out of range

        /* Local variable
        Variable is used within the main method (public static void main(string[] args))
        Outside the main method it is not accessible eg: age is local variable
         */
        short $ = 128;
        System.out.println($);

       // short _ = 128; // can't be used

        short _age = 124;
        System.out.println(_age);

        String $notes ="Written";   //variable can start with only _ and $




    }
}
