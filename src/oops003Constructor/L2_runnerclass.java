package src.oops003Constructor;

public class L2_runnerclass {

    public static void main(String[] args)
    {
        L2_Default_parameterized p1 = new L2_Default_parameterized();  //will call default constructor

        //below will call parameterized constructor
        L2_Default_parameterized p2 = new L2_Default_parameterized(10, "Divya", true);
        L2_Default_parameterized p3 = new L2_Default_parameterized(34, "Raja", true);

    }
}
