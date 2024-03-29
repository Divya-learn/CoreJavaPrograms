package src.stringsconcept_pavan;

import java.util.Arrays;

public class C1_stringmethods {

    public static void main(String[] args)
    {
        //length()  -->returns the length of the string

        String s ="welcome";
        int s1=s.length();
        System.out.println(s1);
        System.out.println(s.length());
        System.out.println("book".length());

        System.out.println("-----------------------");

        //concat() --> joins two string

        String sa = "welcome";
        String sb = "to java";
        System.out.println(sa+sb);
        System.out.println(sa.concat(sb));
        System.out.println("welcome" + "to java");
        System.out.println("welcome".concat("to java"));

        String sc = "automation";
        //if we are adding third string how we can concat.. concat will join two strings at a time
        System.out.println(sa.concat(sb).concat(sc));
                        //      |           |
                        // welcome to java  |
                        //                  welcome to java automation
        //1st need to add two string and with the answer add to another string
        System.out.println(sa.concat(sb+sc));

        /*
         we can concat using (+) operator or (string) methods--> concat
             + operator --> between two strings act as concat
             + operator --> between two number act as addition
             + operator --> between number and string act as concat
         */

        //trim() --> remove spaces on right and left side

        String str = "      hello      ";
        System.out.println(str);     //         hello
        System.out.println(str.length());  // 17 (spaces also included)
        System.out.println(str.trim());    //hello  (spaces removed)
        System.out.println(str.trim().length()); //5    spaces removed and length is identified


        //charAt()  --> returns a character from a string based on index

        str = "Book";
        System.out.println(str.charAt(3));  //k

        //contains --> check string is part of main string or not. returns true or false
        //         --> check for sequence of character

        str = "welcome to home";
        System.out.println(str.contains("me ")); //true
        System.out.println(str.contains("tome")); // false
        System.out.println(str.contains("welme")); //false
        System.out.println(str.contains("lco")); //true
                   //see the difference carefully  me   --> character is in seguence
                   //                              tome --> character is not sequence
                   //                              welme --> character is not sequence
                   //                               lco  --> character is sequence

        //equals()   , equalsIgnoreCase()    --> compare strings

        //replace() --> replace single/multiple(sequence) of characters in a string
        String a1 ="Hello I am divya";
        System.out.println(a1.replace('l','q'));
        System.out.println(a1.replace("divya","Sabari"));

        String a2 = "aabbccwwkk";  // want to replace w --> g  b--> m
        System.out.println(a2.replace('w','g').replace('b','m'));


        //substring -->extract substring from the main string
        String a3 ="Kaaleeshwari";
        System.out.println(a3.substring(0,1));  // w
        System.out.println(a3.substring(5,9));  //eshw      5--> starting index 9--> ending index
        System.out.println(a3.substring(2,5));  //ale
             /*
                0 1 2 3 4 5 6 7 8  9 10 11   -->starting index
                K a a l e e s h w  a  r  i
                1 2 3 4 5 6 7 8 9 10 11 12   -->ending index
              */

        //touppercase()      tolowercase()
        String a4 ="How are you?";
        System.out.println(a4.toUpperCase());
        System.out.println(a4.toLowerCase());

        //split() --split the string into multiple parts based on delimeter
        // * , %, ^, &, (, )   cannot be used as delimeter
        String e1 = "abc@gmail.com";
        String a[] =e1.split("@");
        System.out.println(Arrays.toString(a));  //[abc, gmail.com]

        System.out.println(a[0]); //abc
        System.out.println(a[1]); //gmail.com

        String e2 = "abc,123@xyz";    //o/p should be  abc 123 xyz
        String c1[] =e2.split(",");
        System.out.println(Arrays.toString(c1)); // [abc, 123@xyz]
        String c2[] = c1[1].split("@");
        System.out.println(Arrays.toString(c2)); // [123,xyz]

        System.out.println(c1[0]);
        System.out.println(c2[0]);
        System.out.println(c2[1]);

        String c3 = "abc 123";
        String[] c5 =c3.split(" ");
        System.out.println(c5);

        //replace

        String d1 = "$15,20,24";   //o/p should be 152024
        System.out.println(d1.replace("$","").replace(",",""));

        String d2 = " 23$"; //o/p should be 23
        System.out.println(d2.replace(" ","").replace("$",""));










    }

}
