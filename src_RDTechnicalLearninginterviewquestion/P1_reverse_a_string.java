package src_RDTechnicalLearninginterviewquestion;

import java.util.Scanner;

public class P1_reverse_a_string {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();

       char a[] = s1.toCharArray();

        for(int i=s1.length()-1;i>0;i--){
            System.out.println(a[i]);
        }

       /* for(int i=s1.length()-1;i>0;i--){

            char a = s1.charAt(i);
            System.out.println(a);
        }
*/
    }
}
