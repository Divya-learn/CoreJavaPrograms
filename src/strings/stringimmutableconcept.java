package src.strings;

public class stringimmutableconcept {

    public static void main(String[] args)
    {
        /*
        s1 new string will be created
        s1.concat will also create new string.It will not replace the s1 This explains the immutablility
        we are printing s1 so o/p is hi
         */
        String s1 = "Hi";
         s1.concat("Divya");
        System.out.println(s1);   //o/p : hi

        /*
          s2 creates a new string
          s3 creates a new string
         */

        String s2 = "Hi";
        String s3=s2.concat("Divya");
        System.out.println(s2); //op: Hi Divya




    }
}
