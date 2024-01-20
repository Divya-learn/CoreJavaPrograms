package src.Programs;

import java.util.Scanner;

public class E11_Reverseastring_METHOD2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();   //sc.next() will take one word alone.
                                        // If we pass any sentence like(I am fine) use sc.nextLine don't use sc.next()

        char[] array = name.toCharArray();

 /*       int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;

        }
        System.out.println(array);
*/
        //below is wrong need to fix
        char temp;
        for(int i=0;i<array.length;i++)
        {
            for(int j=array.length-1;j>=0;j--)
            {
                if(i<j)
                {
                    temp= array[i];
                    array[i] = array[j];
                    array[j] =temp;
                }
            }

        }
        System.out.println(array);
    }
}