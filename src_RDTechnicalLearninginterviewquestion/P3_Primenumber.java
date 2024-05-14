package src_RDTechnicalLearninginterviewquestion;

import java.util.Scanner;

public class P3_Primenumber {


    public static void primenumber(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                temp++;
            }
        }
if(temp>1){
    System.out.println("not a prime");
}
else{
    System.out.println("prime");
}

    }

    public static void main(String[] args){
        primenumber();


    }
}
