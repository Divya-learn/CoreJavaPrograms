package src.basic001;

public class Lab003_datatype {
    public static void main(String[] args)
    {
        byte age2 = 45;
        short age=10;         // same variable name not used
        int number =234;
        long phonenumber = 3456789456l; // need to give l at the end
        float  number2 = 345.67f;  //need to give f at the end
        double _num3 = 34.567894;
        char ch ='A';
        char ch2 ='@';    //can store special character in char
        char $ch4 ='%';
        int _numb = 345;   // In variable name we can use underscore and dollar
        System.out.println(ch2);
        System.out.println(ch);
        // Difference between print and println

        System.out.println("Hi divya"); //println -->prints the string and move the cursor to next line
        System.out.print("Hello"); // print -->prints the string and doesn't move the cursor to next line
        System.out.print("How are you?");

        int num3 = 345;
        System.out.printf("Your number is %d",num3); // printf -->Formatting the string
        char ch4 = 'A';
        System.out.printf("Alphabet first character is %c",ch4);
        long mobilenumber = 3456787655l;
        System.out.printf("Your mobile number is %d",mobilenumber);

        /*  %d - byte,short,int,long
            %c - char
            %s - string
            %f - float
         */
        String sentence = "I am learning java";
        System.out.println("Today"+sentence);
        String sentence2 = "It is very cold";
        System.out.printf("Today %s",sentence2);

                 int b=90;
                     b=89;    // replacing b with 89
        System.out.println(b);
                int b1 = 23;
              //int b1 = 45;  // same variable cannot be used

        int c1 =34;
        int c2 = 34; // same value can be used

        // int  name ="null";  null cannot be stored in primitive datatype(byte,short,int,long,float,double,boolen)
        String name = "null";  //null can be stored in string (reference type)


}
}