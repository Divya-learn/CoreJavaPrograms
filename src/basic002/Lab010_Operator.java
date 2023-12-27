package src.basic002;

public class Lab010_Operator {
    public static void main(String[] args)
    {
     //Relational Operator

   //In case of string
   //   == --> check for memory location   -->same memory location - true
   //                                      -->Different memory location - false
   //   .equals -->check for content       -->same content - true
   //                                      -->Diffrent content - false
        String name ="Divya";    // different memory is created and value is stored in string pool
        String name2 ="Preethy"; // different memory is created and value is stored in string pool
        System.out.println(name == name2); //Different memory location o/p:- False
        System.out.println(name.equals(name2)); //check for content(content (name & name2) differ) o/p:False

        String Things = "Box"; //memory is created and value is stored in string pool
        String Things2 = "Box"; //since same content so different memory is not created.Points to the same memory created for Things
        System.out.println(Things == Things2); //same memory location o/p:-true
        System.out.println(Things.equals(Things2)); // same content o/p: true

        // In case of creating a string using new Keyword

        String Question = new String("Who are you?"); //string created in heap area
        String Question2 = new String("How are you?");
        System.out.println(Question == Question2); //Different memory location //False
        System.out.println(Question.equals(Question2)); //Different content //False

        String Answer = new String("I am good"); //string created in heap area
        String Answer2 = new String("I am good");
        System.out.println(Answer == Answer2); //Different memory location //False
        System.out.println(Answer.equals(Answer2)); //same content //true

  // see the diffrence between between Things and Answer


    }
}
