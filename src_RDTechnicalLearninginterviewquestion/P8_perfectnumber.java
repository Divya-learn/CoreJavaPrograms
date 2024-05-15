package src_RDTechnicalLearninginterviewquestion;

import java.util.Scanner;

public class P8_perfectnumber {

    //6 -> 1,2,3,4,5 (n-1)  including 1 but excluding itself(6)
    //6 is divisible by 1   6%1 ==0
    //6 is divisible by 2   6%2 ==0
    //6 is divisible by 3   6%3 ==0
    //6 is not divisible by 4
    //6 is not divisible by 5
    // the add 1+2+3 = 6         given num is 6 that number should equals to (1+2+3) = 6

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 =0;
        for(int i = 1; i < num; i++) {

            if(num % i ==0){
               num1 = num1 + i;
            }

        }
        if(num1 == num){
            System.out.println("perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }

    }
}