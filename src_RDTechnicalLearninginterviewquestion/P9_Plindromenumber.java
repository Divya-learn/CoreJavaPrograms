package src_RDTechnicalLearninginterviewquestion;

import java.util.Scanner;

public class P9_Plindromenumber {

    public static void palindrome() {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev =0;
        while (num > 0) {
            int num1 = num % 10;
            rev = rev *10 +num1;
            num = num / 10;
        }
        if (temp== rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }


    }
    public static void main(String[] args){
        palindrome();

    }
}
