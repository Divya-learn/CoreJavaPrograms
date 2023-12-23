package src.basic001;

public class Lab004 {

    public static void main(String[] args)
    {
        // constant means can't able to change the value by using "final" keyword
        final String sentence = "I am looking good"; // By using final keyword value cannot be canged
        System.out.println(sentence);
        // sentence ="I am not available today";
        System.out.println(sentence);

        final int  num=24;
        final double num2 = 34.56789;

     final float num3 = 34.56f;
       // num3 = 345.5f;

        char ch ='\u0041'; //unicode
        System.out.println("Unicode of A is " + ch);

        //ASCII Table
        /* 0-9 --> 48 - 57
           A-Z --> 65 - 90
           a-z --> 97 - 122
         */

        //Decimal system
        int age =10;

        //Octal system
        int octal = 0101;   // To store octal value add "0" infornt of octal value
                            // Octal - 101 --> store in int add 0 infront of 101
                            // eg: 0101   o/p is 65  any see the java pdf
        System.out.println("Octal value of 0101 is"+ octal);

        //Binary system
        int binary = 0b0111; // To store binary value add "0b" infront of binary value
                            // Binary - 0111 --> store in int add 0b infront of 0111
                            // eg: 0b0111  o/p is 7
        System.out.println("Binary value of 0b0111 is"+ binary);

        //Hexadecimal system
        int hexadecimal = 0xface;   // store hexadeciaml add "0x"
        System.out.println("Hexadecimal value of"+hexadecimal);




    }
}
