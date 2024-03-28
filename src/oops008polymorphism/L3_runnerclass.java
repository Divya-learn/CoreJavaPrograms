package src.oops008polymorphism;

public class L3_runnerclass {

    public static void main(String[] args){

        L3_overloading_overriding_inmultiple_class_1 p1 = new L3_overloading_overriding_inmultiple_class_1();
        p1.Bank("IOS");
        int c = p1.ICICI(4);
        System.out.println(c);
        p1.Bank();
        p1.CUB();

        L3_overloading_Overriding_inmultiple_class_0 p2 = new L3_overloading_Overriding_inmultiple_class_0();
        p2.Bank();
        p2.CUB();
        p2.ICICI(20);


    }
}
