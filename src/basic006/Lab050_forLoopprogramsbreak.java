package src.basic006;

public class Lab050_forLoopprogramsbreak {

    public static void main(String[] args)
    {
        System.out.println("Print the value of i and I want to break when i==5");
        for(int i=1;i<=10;i++)
        {
            System.out.println("value of i " + i);  // 1 hi ,2 hi,3 hi,4 hi,5, hello
           if(i==5) {
               break;
           }
           System.out.println("Hi");
        }
        System.out.println("Hello");



 /*     for(int i=0;i<10;i++)
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

*/

    }
}
