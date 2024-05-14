package src_RDTechnicalLearninginterviewquestion;

import java.util.Scanner;

public class P4_Factorial {

    public static int Factorial(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++){
          fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args){

        int number = Factorial();
        System.out.println(number);



    }
}
