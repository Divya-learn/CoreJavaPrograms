package src_RDTechnicalLearninginterviewquestion;

/*public class P11_printmultiplication {

    public static void main(String[] args){
        int t =2;
        for(int i=1;i<10;i++){
            int n = t *i;
            System.out.println(t+"*"+i +"="+ n);
          }


        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }



    }
}
*/

public class P11_printmultiplication {

    public static void main(String[] args){

        int num[] = {3,4,5,6,7};

        int count =0;
        System.out.println("First element"+num[0]);
        System.out.println("SecondElement"+num[4]);

        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);

            if(num[i]>=0){
                count++;
            }

        }
        System.out.println(count);



    }

}