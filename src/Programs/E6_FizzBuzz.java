package src.Programs;

public class E6_FizzBuzz {

    /*
    Write a program that print number from 1 to 100.
     For multiplies of 3 print 'FIZZ' instead of number.
     For multiplies of 5 print 'BUZZ' instead of number.
     For numbers which are multiplies of both 3 and 5 print 'FIZZBUZZ'
     */
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println("FIZZBUZZ");
            }
            else if (i % 5 == 0) {
                System.out.println("BUZZ");
            }
            else if( i%3 ==0) {
                System.out.println("FIZZ");
            }
            else{
                System.out.println(i);
            }
            // System.out.println(i);

        }
    }
}