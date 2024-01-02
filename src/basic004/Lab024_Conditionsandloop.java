package src.basic004;

public class Lab024_Conditionsandloop {

    public static void main(String[] args)
    {
        boolean a=true;
        a = !a;
        if(2+2 >= 4)  //Both statement will be executed 1st: condition is true 2nd: outside of the loop
        {
            System.out.println("Inside the loop code will be execute when the condition is true");
        }
        System.out.println("This is outside the loop, it will be executed always");
    }
}
