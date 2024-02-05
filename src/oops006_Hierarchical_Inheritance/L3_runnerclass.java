package src.oops006_Hierarchical_Inheritance;

public class L3_runnerclass {

    public static void main(String[] args)
    {
        L3_Cat_C p1 = new L3_Cat_C();
        p1.eat();
        p1.sleep();
     //   p1.bark()   not possible

        L3_Dog_B p2 = new L3_Dog_B();
        p2.Bark();
        p2.sleep();

        L3_Animal_A p3 = new L3_Animal_A();
        p3.sleep();

        L3_Animal_A p4= new L3_Dog_B();
        p4.sleep();
      //  p4.Bark(); not possible

        L3_Animal_A p5 = new L3_Cat_C();
        p5.sleep();

     //   L3_Dog_B p6 = new L3_Cat_C();    no relation between between B and C

     //   L3_Cat_C p7 = new L3_Animal_A();
      //    L3_Dog_B p8 = new L3_Animal_A();

    }
}
