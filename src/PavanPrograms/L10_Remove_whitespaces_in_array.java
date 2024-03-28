package src.PavanPrograms;

import java.util.Scanner;

public class L10_Remove_whitespaces_in_array {

    public static void main(String[] args)
    {
        //w e l c o m e

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();



    /*    for(int i=0;i<word.length();i++){

            char s = word.charAt(i);

            if(s != ' '){

                System.out.print(s);
            }
        }
*/
   //     System.out.println(word.replace(" ",""));

          char[] a = word.toCharArray();

          for(int i=0;i<word.length();i++){

              if(a[i] != ' ')
              {
                  System.out.print(a[i]);
              }

          }


    }
}
