package src.Hackerrankpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class L2 {

    public static <string> void main(String[] args) {
      /* ArrayList<String> name1 = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
           boolean input = true;

        while(input)
        {

        }

*/


       Scanner sc = new Scanner(System.in);
        ArrayList<String> name1 = new ArrayList<>();
        while (sc.hasNextLine()) {
            String input  = sc.nextLine();
            name1.add(input);
            if(input.contains("End of File")) {
                break;
            }
            //name1.add(input);
        }
        for (int i = 0; i < name1.size(); i++)
        {
            System.out.println((i+1) +" "+ name1.get(i));
        }




/*        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
         }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


*/


    }
    }

