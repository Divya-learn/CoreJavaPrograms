package src.Programs2;

import java.util.Scanner;

public class E13_Numberofrepetations {

    public static void main(String[] args) {
        //Find how many duplicate in array         10 20 10 20 10 40 30      --> 20 10 are repeated

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 9 number");
        int[] array = new int[9];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {      //for(int i=0;i<array.length-1;i++)

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {

                    System.out.println(array[i]);
                }

            }
        }
    }
}
