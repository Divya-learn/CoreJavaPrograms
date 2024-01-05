package src.basic006;

public class Lab040_Loopinterviewquestion {

    public static void main(String[] args)
    {
        boolean b = true;
        b=false;
        for(;b;) //condition is false
        {
            System.out.println("Hi"); //so o/p is empty does not print anything
        }

    /*    boolean b1 = true;
        for(;b1;) //condition is true
        {
            System.out.println("Hello"); //so o/p is print hello infinitely
        } */

        for(float f=1; f<=12.33;f++) //in for loop float is used but it takes integer
        {
            System.out.println("Hello world"); //loop will iterate from 1 to 12
        }

        for(double f=1.1; f<=12.33;f++) //in for loop double is used but it takes integer
        {
            System.out.println("Hello world"); //loop will iterate from 1 to 12
        }


        for(int i=0; i>1;i++)   //0>1 condition false
        {
            System.out.println("sen"); //this will not be printed
        }//come out from the loop
        System.out.println("Book");   //o/p Book will be printed

    }
}
