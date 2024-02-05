package src.oops005_multilevel_inheritance;

public class L2_runnerclass {

    public static void main(String[] args)
    {
        L2_Father_B p1 = new L2_Father_B();      // C C
        p1.Bhk3();
        p1.bhk2();

        L2_Grandfather_A p2 = new L2_Grandfather_A(); // p p
        p2.Bhk3();

        L2_Grandfather_A p3 = new L2_Father_B();  //P C
      //  p3.bhk2();
        p3.Bhk3();

     //   L2_Father_B p4 = new L2_Grandfather_A(); // C P

        L2_Son_C a1 = new L2_Son_C();  // C C
        a1.bhk1();
        a1.bhk2();
        a1.Bhk3();

        L2_Father_B a2 = new  L2_Son_C();  //p c
        a2.bhk2();
        a2.Bhk3();

        L2_Grandfather_A a3 = new L2_Son_C();
        a3.Bhk3();


        //Below  gives error
   /*     L2_Son_C c1 = new L2_Father_B();
        L2_Son_C c2 = new L2_Grandfather_A();
        L2_Father_B c3 = new L2_Grandfather_A();
*/


    }
}
