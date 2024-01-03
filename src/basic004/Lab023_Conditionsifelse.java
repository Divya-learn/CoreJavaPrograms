package src.basic004;

public class Lab023_Conditionsifelse {

    public static void main(String[] args)
    {
        /*
        if(condition){
        }
        else{
        }

         */

        boolean b=false;
        if(true)    //see the condition it is true always value of b is not used
                    // if(b) { sysout ("b is T")} else {sysout ("b is False")} then o/p is b is false
        {
            System.out.println("b is true");   //o/p is b is true because see the condition
        }
        else {
            System.out.println("b is False");
        }

        if(b)
        {
            System.out.println("b is true");   //o/p is b is false because see the condition
        }
        else {
            System.out.println("b is False");
        }
    }
}
