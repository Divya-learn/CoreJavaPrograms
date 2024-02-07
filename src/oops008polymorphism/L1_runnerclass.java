package src.oops008polymorphism;

public class L1_runnerclass {

    public static void main(String[] args) {
        L1_method_overloading ref = new L1_method_overloading();
        float c = ref.num(1.1f);
        System.out.println(c);

        ref.display();

    }
}