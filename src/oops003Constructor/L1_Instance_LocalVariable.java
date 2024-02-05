package src.oops003Constructor;

public class L1_Instance_LocalVariable {

    int age;      //these are instance variable if we are not setting the value JVM will set
                  // default value int --> 0, String -->null, boolean -->false
    String name;  //Instance variable are accessed by reference name p1
    boolean isMarried;

    void display()
    {
        System.out.println("Printing the values"+age+name+isMarried);
    }
    public static void main(String[] args)
    {
        L1_Instance_LocalVariable p1 = new L1_Instance_LocalVariable();
        p1.display();    //o/p : 0   null   false

        //p1.name ="divya";  Instance variable(name) accessed by reference name (p1)

        int phonenum;   //local variable  if we are not setting the value JVM will not set the defalut value
      //  System.out.println(phonenum);   //o/p error
    }


}
