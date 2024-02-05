package src.oops002class_object;



public class Runnerclass {

    public static void main(String[] args)
    {
        Person p = new Person();
        p.name= "Sabari";
        System.out.println(p.name);

        //Person --> class blueprint
        // p     --> ref variable
        // new Person()  --> object

        p.sleep();


    }
}
