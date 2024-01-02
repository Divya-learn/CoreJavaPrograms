package src.basic003;

public class Lab022_IncrementandDecrementOperator {

    public static void main(String[] args)
    {
        //Increment
        //post increment -- a++
        //pre increment   -- ++a 1st increment and then print
        int a=9;
        System.out.println(++a); //10
        System.out.println(a); //10

        //post increment (a++) --> 1st print then increment
        int c=10;
        System.out.println(c++); //10
        System.out.println(c); //11

        int a1=10;
        int a2 =++a1 + a1++ + a1++;
      //  System.out.println(++a1 + a1++ + a1++); //34
      //  System.out.println(a1); //13
        System.out.println(a2);
        /*
                     exp     a1
               ++a1  11      11
               a1++  11      12
               a1++  12      13
               o/P adding expression value (11+11+12) =34
               now the value of a1 is 13

         */

        int b =10;
        int c1 = ++b +  b++;
        System.out.println(c1); //22

        /*
                     exp    b
                ++b  11     11
                b++  11     12
                o/p adding exp value 11+11 =22

         */

        int c2 = 10;
        System.out.println(--c2 + c2--); //18
        System.out.println(c2); //8

        /*
                         exp    c2
                  --c2    9      9
                  c2--    9      8
                  o/p adding exp value 9 + 9 =18
                  value of c2 is 8
         */

        int c3 =10;
        System.out.println(--c3 + c3++ + ++c3);
        System.out.println(c3);

        /*
                         exp       c3
                   --c3   9        9
                   c3++   9        10
                   ++c3   11       11
                   o/p adding exp value (9+9+11) = 29
                   value of c3 is 11
         */






    }
}
