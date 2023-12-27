package src.basic002;

public class Lab008_Operator {
    public static void main(String[] args)
    {
        //String concatenation important interview question
        int num1 = 20;
        int num2 = 30;
        int num3 = 40;
        String sentence ="I am in mumbai";
        //go from left to right
        System.out.println(num1 + num2 + num3 + sentence); //o/P 70I am in mumbai (int + string)
                //   num1 int(20) + num2 int(30) =50
                //              50 + num3 int(40) = 70
                //              70 + sentence = 70I am in numbai
        System.out.println(sentence + num1+num2+num3); //o/p I am in mumbai203040  (string) All the (+) are concatenation
    }
}
