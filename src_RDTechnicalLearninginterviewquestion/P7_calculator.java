package src_RDTechnicalLearninginterviewquestion;

import java.util.Scanner;

public class P7_calculator {

 /*   public static int sum(int num1, int num2){
        return num1 +num2;
    }
    public static int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static void main(String[] args){

        int result1 = sum(5,4);
        int result2 = sum(8,9,7);
        System.out.println(result1);
        System.out.println(result2);

    }
  */

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter two number");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         System.out.println("Enter which opertaion need to perform");
         String operation = sc.next();
         int result;

         switch(operation){
             case "+":
               result = num1 + num2;
               System.out.println(result);

         }


    }
}
