package src.OOPS002class_object;

public class Methods {

     void hello() {
        System.out.println("sayhello");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Methods p = new Methods();
        p.hello();               //by using the reference we call the methods
        int d = p.sum(5,5);
        System.out.println(d);
    }
}