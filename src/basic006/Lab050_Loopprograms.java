package src.basic006;

public class Lab050_Loopprograms {

    public static void main(String[] args)
    {
     /*   System.out.println("Print the value of i and I want to break when i==5");
        for(int i=1;i<=10;i++)
        {
            System.out.println("value of i " + i);
            if(i==5)
             //   System.out.println("Divya");
                break;
            System.out.println(i);
        }
        System.out.println("Hi");

      */

      for(int i=0;i<10;i++)
      {
          System.out.println("Value of i "+i); //print 1 to 10
      }

//want to print in reverse order

        for(int i=10;i>0;i--)
        {
            System.out.println("Value of i "+i); //print 1 to 10
        }

        //interview question

        for(int i=0;i<10;++i)   //even it is ++i or i++ same thing happens
        {
            System.out.println("Value of i "+i); //print 1 to 10
        }



    }
}
