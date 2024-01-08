package src.basic006;

public class Lab054_prgramforevenandoddbycontinue {

    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++)
        {
            if(i%2 ==0) {
               System.out.println("val of even"+i); // prints even 0
                continue;
            }
            System.out.println("val of odd"+i);     // prints odd
        }

        //Syntax for continue...

      /*  for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Skips the rest of the loop's body if i equals 5
            }
            // Other code within the loop
        }
        */

        //syntax for break....
     /*   for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Terminates the loop when i equals 5
            }
            // Other code within the loop
        }
*/
    }
}
