package src.OOPS001;

public class Lab003_Interviewques {

    public static void main(String[] args) {
        System.out.println(args[0]);    //Passing the argument in edit configuration


        //In before we will pass the arguments in edit configuration

        //But now we will use Scanner class
        main(10);
    }

    static void main(int a) //we can have same method name but different arguments
    {
        System.out.println("void o/p is" + a);
    }

    public static int main(int a, int b)
    {
        return 99;
    }
}
