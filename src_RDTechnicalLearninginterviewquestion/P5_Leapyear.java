package src_RDTechnicalLearninginterviewquestion;

import java.util.Scanner;

public class P5_Leapyear {

    public static boolean Leapyear(){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        return (num % 4 == 0 && num % 100 != 0) || (num % 400 == 0);

    }

    public static void main(String[] args){

        boolean result = Leapyear();
        if(result){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Non leap year");
        }

    }
}
