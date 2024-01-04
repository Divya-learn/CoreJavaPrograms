package src.basic005;
import java.util.Scanner;

public class Lab033_VowelorConsonantbyswitchcondition {

    public static void main(String[] args){

        //program for entered character is vowel or consonant

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        char character = sc.next().toCharArray()[0]; //It gets first character abc means charArray[0] -->a (alone)

        switch(character)
        {
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
            default:
                System.out.println("Consonant");



        }

    }

}
