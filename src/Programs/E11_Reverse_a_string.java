package src.Programs;

import java.util.Scanner;

public class E11_Reverse_a_string {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        for(int i=name.length()-1;i>=0;i--) {
            char name2 = name.charAt(i);
            System.out.print(name2);
        }


        char[] charArray = name.toCharArray();
        for(int i=name.length()-1; i>=0;i--) {
            System.out.print(charArray[i]);
        }


    }
}
