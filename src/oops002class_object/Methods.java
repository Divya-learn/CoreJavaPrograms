package src.oops002class_object;

public class Methods {

    public String name;
    public  String password;
    private void hello() {
        System.out.println("sayhello");
    } //private --> within the class it can be called
      //If we created private method in one class and calling it in from another class it is not possible

     int sum(int a, int b) {return a + b;}
     static int sum(int a, int b,int c) {return a + b+c;}

    static boolean islogged(String name, String password)
    {
        return true;
    }


    public static void main(String[] args) {
        Methods p = new Methods();   //  If the sum method is not static(i.e int sum(int a, int b) {return a + b;}) we can create instance p and creating object
                      //by using the reference we call the methods (methods p= new methods())
        p.hello();
        int d = p.sum(5,5);
        System.out.println(d);

        int d1 = Methods.sum(5,5,1); //If the sum method is static(i.e static int sum(int a, int b,int c) {return a + b+c;})
        System.out.println(d1); //we can directly use class name (methods.sum(5,5,1))


       /* boolean check = Methods.islogged("divya","ddd");
        System.out.println(check);
        */

    }
}