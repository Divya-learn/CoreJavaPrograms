package src.oops008polymorphism;

public class L2_runnerclass {

    public static void main(String[] args) {

        L2_methodoverriding_Dog ref = new L2_methodoverriding_Dog();
        ref.bark();   //It will print child but different in single inheritance only print newly implemented code

        L2_methodoverriding_Animal ref1 = new L2_methodoverriding_Animal();
        ref1.bark();

      //  L2_methodoverriding_Dog ref3 = new L2_methodoverriding_Animal(); not possible

        L2_methodoverriding_Animal ref4 = new L2_methodoverriding_Dog();
        ref4.bark(); //It will print child but different in single inheritance


    }


}