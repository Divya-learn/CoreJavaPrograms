package src.basic006;

public class Lab039_Loopinterviewques {

    public static void main(String[] args)
    {
        //10 times Hi will be printed and will get process finished with exit code 0 in console so program runs successsfully
        for(int i=1;i<=10;i++)
        {
            System.out.println("Hi");
        }

        //while executing the below program if clicked stop then in console will get process finished wit exit code 130 (i.e user interrupted)
        for(int i=1;i<=1000000;i++)
        {
            System.out.println("Hello");
        }

        for(; ;) //infinite loop --> no condition no initialization
        {
            System.out.println("Hello world"); //prints hello world infinitely
        }




    }
}
