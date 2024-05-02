package src.PavanPrograms;

import java.util.Scanner;

public class L17_All_zeros_are_front {

    public static void main(String[] args) {

        //I/P : 3,2,4,0,0,1,2,1,2,0,0
        //O/p : 00003241212

        Scanner sc = new Scanner(System.in);

       int[] a = new int[]{3,2,4,0,0,1,2,1,2,0,0};
      // int[] b = new int[] { };

       for(int i=0;i<a.length;i++) {
           for (int j = i + 1; j < a.length; j++) {
               if (a[i] == 0) {
                   int temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
           }
           System.out.println(a[i]);

       }

        }
    }

