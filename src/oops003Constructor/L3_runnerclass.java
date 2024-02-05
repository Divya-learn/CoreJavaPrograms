package src.oops003Constructor;

import java.util.Scanner;

public class L3_runnerclass {

    public static void main(String[] args)
    {
        L3_method_default_paramaterized p1 = new L3_method_default_paramaterized();  //will call default constructor  1st

        //below will call parameterized constructor
        L3_method_default_paramaterized p2 = new L3_method_default_paramaterized(10, "Divya", true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Say name");
        String name = sc.next();
        System.out.println("Say age");
        int age = sc.nextInt();
        L3_method_default_paramaterized p3 = new L3_method_default_paramaterized(age,name, true);

        //below will call method
    //    p1.display();
        p2.display();
        p3.display();

     //   Note :- carefully see the line of execution
    }

}
