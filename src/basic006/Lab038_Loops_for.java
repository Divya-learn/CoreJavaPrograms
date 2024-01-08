package src.basic006;

public class Lab038_Loops_for {

    public static void main(String[] args)
    {
        /*
        //For loop
        1. perform a task multiple times
        2. Based on a condition perform a task multiple times
         */
     //   System.out.println("Hello world"); //need to print 10 times
        //how we can do in for loop as follows
        /*
        for(A;B;C)
        A -> Initialization -->JVM checks for what variable and where need to start
        B -> Condition      -->When you want to stop
        C -> Increment/Decrement

        A -> int i=1   start from 1
        B ->  i<=10    stop at 10
        C ->  i++      Increment
        D ->  code    system.out.println("Hello world")

        for(A;B;C)
        {
        D
        }
         */
     //starts from 1,2,3,4,5,6,
        // ,8,9,10

        for(int i=1; i<=10; i++)
        {
            System.out.println("Hello World");
        }

     //starts from 0,1,2,3,4,5,6,7,8,9
  /*      for(int i=0; i<10; i++)
        {
            System.out.println("Hello World");
        }
*/
        //print reverse order 10 to 1
        for(int i=10; i>0;i--)
        {
            System.out.println(i);
        }

    }
}
