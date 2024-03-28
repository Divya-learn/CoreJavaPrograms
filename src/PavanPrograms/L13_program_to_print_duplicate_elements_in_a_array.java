package src.PavanPrograms;

import java.util.Scanner;

public class L13_program_to_print_duplicate_elements_in_a_array {

    //Ip: 1 2 3 4 2 7 8 8 3

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a[] = new int[sc.nextInt()];
        
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }

    }
}
