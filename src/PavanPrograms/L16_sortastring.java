package src.PavanPrograms;

import java.util.Scanner;

public class L16_sortastring {

    public static void main(String[] args){

        //I/p:  edcab
        //o/p:  abcde

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char[] a = word.toCharArray();

        for(int i=0;i<a.length;i++) {
            int j;
            for (j = i + 1; j < a.length; j++) {

                if ((int) a[i] > (int) a[j]) {

                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }

    }
}
