package src.basic004;

public class Lab028_ConditionsandloopsInterviewques {

    public static void main(String[] args)
    {
        if(true)
        {
            System.out.println("1");
            if(true)
            {
                System.out.println("2");
                if(true)
                {                                     //op:
                    System.out.println("3");          //1
                }                                     //2
            }                                         //3
        }
    }
}
