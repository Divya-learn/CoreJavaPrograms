package src.basic003;

public class Lab016_StringFunctions {
    public static void main(String[] args)
    {
        String name ="Hello"; //created in string pool
        String name2 = new String("World"); //created in heap area

        System.out.println(name.length()); //length starts from 1
        System.out.println(name2.toUpperCase());
        System.out.println(name2.toLowerCase());

        String sen = new String("I am");
        String sen2 = new String("i am");

        System.out.println(sen.equals(sen2)); //different content false
        //To rectify this by using .equalsIgnoreCase then becomes true
        System.out.println(sen.equalsIgnoreCase(sen2)); //true
    }
}
