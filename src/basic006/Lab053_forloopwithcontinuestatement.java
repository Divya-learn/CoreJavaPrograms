package src.basic006;

public class Lab053_forloopwithcontinuestatement {

    public static void main(String[] args)
    {
        //continue --> move back to execution

        for(int i=0;i<=10;i++)
        {
            System.out.println(i);                 //0,1,2,3,4,5,6,7,8,9,10
            if(i==6)
            {
                continue;
            }
            System.out.println(i);                 //0,1,2,3,4,5,7,8,9,10
        }                                //break come out from the current loop
                                         //continue skips the current iteration move back to next iteration

        for (int i = 0; i < 10; i++) {
            System.out.println(i); // Print statement before the condition check and continue
            if (i == 5) {
                continue; // Skips the rest of the loop's body if i equals 5
            }
            // Other code (if any) after the continue
        }

    }
}
