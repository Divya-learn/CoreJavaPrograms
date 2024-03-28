package src.PavanPrograms;

import java.util.Scanner;

public class L11_Check_string_is_palindromeornot {

    //Ip: madam     Op: madam
    void palindrome(String word){    //wromg need to seee.........

        char a[] = word.toCharArray();
        String s="";

        for(int i=a.length-1;i>=0;i--)
        {
            s= s+ a[i];
        }
        if(s==word)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

       // String word = sc.nextLine();

        L11_Check_string_is_palindromeornot gr = new L11_Check_string_is_palindromeornot();

        gr.palindrome(sc.nextLine());


    }
}
