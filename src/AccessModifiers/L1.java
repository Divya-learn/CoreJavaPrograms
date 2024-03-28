package src.AccessModifiers;

public class L1 {

    private int num1;

    public void add(){
        System.out.println("public add");
    }

    void add1(){
        System.out.println("default add");
    }

    protected void add4(){
        System.out.println("protected add");
    }

}
