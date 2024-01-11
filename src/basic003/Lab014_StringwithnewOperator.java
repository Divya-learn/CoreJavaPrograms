package src.basic003;

public class Lab014_StringwithnewOperator {
    public static void main(String[] args)
    {
   /*    String name ="Divya";
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
        String Answer3 = Answer2;
        System.out.println(Answer == Answer2); //Different memory location //False
        System.out.println(Answer.equals(Answer2)); //same content //true
        System.out.println(Answer3== Answer2); //Answer2 is assigned to asnwer3 shares same memory location o/p true

        System.out.println("-------");
        String Question = new String("Who are you?"); //string created in heap area
        String Question2 = new String("How are you?");
        String Question3 = Question2;
        System.out.println(Question == Question2); //Different memory location //False
        System.out.println(Question.equals(Question2));//Different content //False
        System.out.println(Question3== Question2); //Question2 is assigned to Question3 shares same memory location o/p true


       System.out.println("-------");

        String Things = "Box"; //memory is created and value is stored in string pool
        String Things2 = "Box"; //since same content so different memory is not created.Points to the same memory created for Things
        String Things3 = Things2;
        System.out.println(Things == Things2); //same memory location o/p:-true
        System.out.println(Things.equals(Things2)); //same content true
        System.out.println(Things3== Things2); //Question2 is assigned to Question3 shares same memory location o/p true
*/
String s1 = "Pen";
String s2 = "erase";
String s3 = s2;
System.out.println(s3==s2); //true

    }
}
