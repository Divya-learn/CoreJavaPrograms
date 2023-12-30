package src.basic003;

public class Lab013_Typecasting {
    public static void main(String[] args)
    {
        // Widening is the process of converting lower type to higher type
        // Implicit type casting is done automatically by the complier, there is no loss of data because changing the type from lower to higher

        int num1 = 89;
       // float num2 = num1; //Implicit conversion lower to higher type
        float num2 = (float) num1; //Explicit conversion
        System.out.println(num2); //89.0

        // Narrowing is the process of converting higher type to lower type
        // Explicit type conversion requires manual intervention and there is loss of data because changing the type from higher to lower

        float num3 = 67.89f;
       // int num4 = num3; //Implicit can't be done --->Invalid
        int num4 = (int)num3; //So doing Explicit conversion done
        System.out.println(num4); //67

      //  note:- In widening   --> Implicit can be done automatically by the complier
      //                       --> Explicit can be done 
        //       In narrowing  --> Implicit cannot be done
        //                     --> Explicit is done by manually
    }
}
