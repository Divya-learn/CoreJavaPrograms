package src_RDTechnicalLearninginterviewquestion;

public class P6_Reverseanumber {

    public static void reverseanumber(int num){

        int rev =0;
        while(num >0){

            int num1 = num % 10;
            rev = rev *10+num1;
            num = num /10;

        }
        System.out.println(rev);

    }

    public static void main(String[] args){


        reverseanumber(543);
        
    }
}
