package src.stringsconcept_pavan;

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






    }

}
