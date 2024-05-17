package src_RDTechnicalLearninginterviewquestion;

public class P10_fibonacciseries {
    //without using recursion......
   /* public static void main(String[] args){

        int n1 =0, n2 =1, count=10,n3;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for(int i=2;i<count;i++){

            n3 = n1 +n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
    }
    */

    //with using recursion......  recursion means method call itself continuously
    static int n1 =0, n2 = 1, n3, count =10;
    public static void fibonacci(int count){

        if(count>0){
            n3 = n1+n2;
            System.out.print(n3+" ");
            n1 =n2;
            n2=n3;
            fibonacci(count-1);
        }

    }
    public static void main(String[] args){


        System.out.print(n1+" "+n2+" ");
        fibonacci(count - 2);

    }

}
