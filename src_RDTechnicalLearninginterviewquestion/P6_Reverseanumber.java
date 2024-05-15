package src_RDTechnicalLearninginterviewquestion;

public class P6_Reverseanumber {

    public static void reverseanumber(int num){

        while(num >0){

            int num1 = num % 10;
            num = num /10;
            System.out.print(num1);
        }

    }

    public static void main(String[] args){


        reverseanumber(543);
        
    }
}
