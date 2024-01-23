package src.strings;

public class stringBuilder_stringBuffer {

    public static void main(String[] args)
    {
        StringBuilder s1 = new StringBuilder("divya");
        String s2 = String.valueOf(s1.append("hi"));
        System.out.println(s1);
        System.out.println(s2);

        String st1 = new String("Book");
        String st2 =st1.concat("is mine");
        System.out.println(st1);
        System.out.println(st2);

        StringBuffer str1 = new StringBuffer("Sabari");
        String str2 = String.valueOf(str1.append("hello"));
        System.out.println(str1);
        System.out.println(str2);

        //In string buffer and string bulider original string is changed after concatenation (This explains mutablility)
        //In string original string is not changed after concatenation (this explains immutability)
    }
}
