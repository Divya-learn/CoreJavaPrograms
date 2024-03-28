package src.PavanPrograms;

import java.util.Scanner;

public class L9_Find_missing_number_in_array {

    public static void main(String[] args){

        //Ip
        // N=5
        // a[]={1,2,3,5}
        // O/p: 4

        Scanner sc = new Scanner(System.in);
        int a[]= new int[4];

        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<a.length;i++){
            if(a[i]+1 != a[i+1])
            {
                System.out.println(a[i]+1);

            }

        }





    }
}
