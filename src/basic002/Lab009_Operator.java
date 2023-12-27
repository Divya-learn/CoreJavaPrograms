package src.basic002;

public class Lab009_Operator {
    public static void main(String[] args)
    {
        //String concatenation operator

        //  For primitive data types (like int, char, boolean, etc.), == compares the actual values.
        // For reference types (like objects), == compares the memory addresses (references) of the objects, not their content.
        //   .equals -->refers to check content
      /*  Remember: It's important to use == for comparing primitives
        and for checking if two references point to the same memory location,
        and use .equals() for content-based comparison for objects (when overridden appropriately in classes). */

        String name ="Hello"; //If not using "new" the string is created in string pool
        String name2 = "Hello"; // both name and name2 created in string pool
        System.out.println(name ==name2); //true
        System.out.println(name.equals(name2)); //true

       String sentence = "I am in";
        String sentence2 =" I am not in";
        System.out.println(sentence == sentence2); //false
        System.out.println(sentence.equals(sentence2)); //false

        String sentence3 = "I am in";
            sentence3 =" I am not in";
        System.out.println(sentence3 == sentence3); //true
        System.out.println(sentence3.equals(sentence3)); //true

        String Question = "How are you";       // this string created in string pool
        String Question2 = new String("How are you"); // this string created in heap area so both are not equal
        System.out.println(Question == Question2); //false
        System.out.println(Question.equals(Question2)); //true

        String Answer = new String("I");
        String Answer2 = new String ("I");
        System.out.println(Answer == Answer2);  // false
        System.out.println(Answer.equals(Answer2));//true

        String Heap = new String("Hello");
        String Heap2 = new String ("World");
        System.out.println(Heap == Heap2);  // false
        System.out.println(Heap.equals(Heap2));//false


    }
}
