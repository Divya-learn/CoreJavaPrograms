package src.PavanPrograms;

import java.util.Scanner;

public class L14_Armstrong_number {

    public static void main(String[] args){

        //Armstrong number
        //153:  1^3 + 5^3 + 3^3 = 1+125+27=153  (Armstrong number)
        //1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643 (Armstrong number)
        //125:  1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int temp=n; //assigning n to temp

        int count=0,n1;
        while(temp>0)
        {
            n1 = temp%10;
            temp  =temp/10;

            if(n1 != 0) {
                count++;
            }

        }
//After executing above loop temp becomes 0
// so again reassigning n to temp

        temp=n;

        int num=0;
        while(temp>0) {

            n1 = temp % 10;
            temp = temp / 10;

            num = num + (int) Math.pow(n1, count);
        }
            if(num == n)
            {
                System.out.println("Armstrongnumber");
            }
            else {
                System.out.println("Not a Armstrongnumber");
            }



    }
}
