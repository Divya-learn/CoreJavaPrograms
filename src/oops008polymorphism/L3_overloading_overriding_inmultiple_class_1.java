package src.oops008polymorphism;

public class L3_overloading_overriding_inmultiple_class_1 extends L3_overloading_Overriding_inmultiple_class_0{

    void Bank(String bankname){  //overloaded
        System.out.println("1st method"+bankname);

    }

    int ICICI(int bal){ //overided

        return bal+bal;
    }


}
