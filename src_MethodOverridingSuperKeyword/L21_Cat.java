package src_MethodOverridingSuperKeyword;

public class L21_Cat extends L2_Dog{

    void eat(){

        super.eat();
        System.out.println("Cat eating");
    }
}
