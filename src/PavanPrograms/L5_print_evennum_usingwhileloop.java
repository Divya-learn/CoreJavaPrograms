package src.PavanPrograms;

public class L5_print_evennum_usingwhileloop {

    public static void main(String[] args)
    {
        //printing even number from 1 to 10

        int i = 2;
        while(i<=10)
        {
            System.out.println(i);
            i+=2;
        }

        //Specify odd or even from 1 to 10  i.e 1 odd, 2 even, 3 odd

        int j=1;
        while(j<=10)
        {
            if(j%2==0)
            {
                System.out.println(j + "Even");
            }
            else
            {
                System.out.println(j + "Odd");
            }
            j++;
        }



    }
}
