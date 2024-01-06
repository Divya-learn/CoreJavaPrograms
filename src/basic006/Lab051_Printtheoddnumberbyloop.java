package src.basic006;

public class Lab051_Printtheoddnumberbyloop {

    public static void main(String[] args)
    {
        //print the odd between 1 to 50
        //if else can't be used because it checks for one condition

     /*   for(int i=1; i<=50; i++)
        {
            if(i%2 == 1)
            {
                System.out.println(i+ "Odd");
            }
        }

        for(int i=50; i>0; i--)
        {
            if(i%2 == 1)
            {
                System.out.println(i);
            }
        } */

        //Multiplication table
        for(int i=1; i<=20; i++)
        {
            //int j=i*2;
            int num =2; //2nd table
            System.out.println(i + "x" + num + "="  + (i*num));
        }
    }
}
