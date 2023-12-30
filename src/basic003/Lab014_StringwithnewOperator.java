package src.basic003;

public class Lab014_StringwithnewOperator {
    public static void main(String[] args)
    {
        String name ="Divya";
               name ="Preethy";
               System.out.println(name == name); //T
               System.out.println(name.equals(name)); //T

        System.out.println("-------");

        String name2 = new String("Sabari");
               name2 = new String("Valar");
               System.out.println(name2 == name2); //T
               System.out.println(name2.equals(name2)); //T

        System.out.println("-------");

        String Answer = new String("I am good"); //string created in heap area
        String Answer2 = new String("I am good");
        System.out.println(Answer == Answer2); //Different memory location //False
        System.out.println(Answer.equals(Answer2)); //same content //true

        System.out.println("-------");
        String Question = new String("Who are you?"); //string created in heap area
        String Question2 = new String("How are you?");
        System.out.println(Question == Question2); //Different memory location //False
        System.out.println(Question.equals(Question2));//Different content //False

        System.out.println("-------");

        String Things = "Box"; //memory is created and value is stored in string pool
        String Things2 = "Box"; //since same content so different memory is not created.Points to the same memory created for Things
        System.out.println(Things == Things2); //same memory location o/p:-true
        System.out.println(Things.equals(Things2)); //same content true




    }
}
