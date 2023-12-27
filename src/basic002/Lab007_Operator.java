package src.basic002;

public class Lab007_Operator {
    public static void main(String[] args) {
        //Airthmetic operator (+,-,*,%,/)  -->needs two operand (a,b)

        //Urnary Operator //needs only one operand
        int num1 = +10;
        int num2 = -34;

        System.out.println(num1 + num2);

        int num3 = 67;
        double num4 = 56.789;   //if we add int + double gives result as double
        System.out.println(num3+num4);

        //String concatenation operator  //adding two string
        String sentence =  "Note";
        String sentence2 = "Book";
        System.out.println(sentence + sentence2);

        //Important concept interview ques:

        int n1 = 30 , n2 = 40;
        String name ="Jeni";
        //Start from left to right.
        // If there are 2 integer addition occurs.
        //String +other(number) -->Concatenation occurs
        /* n1+n2+name -->(start from left to right) n1 + n2 = 70 addition (2 integer addition occurs)
                                                    70+ name =70Jeni  concatenation (integer + string concatenation occurs)
           name+n1+n2 -->(start from left to right) name + n1 = Jeni30 concatenation (string + integer concatenation occurs)
                                                    Jeni30 +n2 = Jeni3040 Concatenation (string + integer concatenation occurs)
         */

        System.out.println(n1+n2+name); // op: 70Jeni
        System.out.println(name+n1+n2); // op: Jeni3040


        //Compound Assignment Operator (+=, -=, *=, %=, /=)
        int a1 = 10;
         a1+=10;
         System.out.println(a1);





    }
}
