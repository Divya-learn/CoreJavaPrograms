package src.basic002;

public class Lab012_Operator {
    public static void main(String[] args)
    {
        //Logical Operator
        //! (Not) used for boolean
        boolean a=true;
        System.out.println(a);
        System.out.println(!a);
       // System.out.println(!10);//Integer Not possible gives error
        System.out.println(90>10);
        System.out.println(!(90>10));

        System.out.println("-------");

        // && AND gate       T && T --> T
        //                   T && F --> F
        //                   F && T --> F
        //                   F && F --> F
        System.out.println(true && false);

        System.out.println("-------");

        // || OR gate        T && T --> T
        //                   T && F --> T
        //                   F && T --> T
        //                   F && F --> F
        System.out.println(true || false);

        int a1 =30, b1= 40;
        boolean c = !(a1>45 && b1<23);
        System.out.println("O/p"+c);


    }
}
