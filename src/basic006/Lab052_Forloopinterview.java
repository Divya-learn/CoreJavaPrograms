package src.basic006;

public class Lab052_Forloopinterview {

    public static void main(String[] args) {
        //break.... in for loop  come out from the current loop

        /*
        Note: 1.check for the condition
              2.check break if there is break come out from the current loop for{
                                                                          if()
                                                                          break;
                                                                          } come out from the loop
              3.if there is any code written after the break will not be executed
                       eg:   for()
                               {
                               if(condition)
                               break;
                               System.out.println(""); This code will not be executed
                               }come out from the loop
              4.Break should have condition  if(condition)
                                                break;
         */

   /*     int i;
        for (i = 0; i < 10; i++) {
            //   System.out.println(i);
            break;
        }
        System.out.println(i);

        for (int k = 0; k < 10; k++) {
            break;
            //  System.out.println(k); //this statement is unreachable
        }
*/

        int j;
        for (j = 1; j < 10; j++) {
            //System.out.println(j);
            if (j % 2 == 0) // 1%2 ==1 condition false, 2%2==0 condition true break is always used with the condition
                break; //2%2 conditon true break happens
            //  System.out.println(j); //this statement is unreachable not executed
        } //come out from loop
        System.out.println(j);

        /*
        if(j%2 ==0)  (0%2 ans is 0, 1%2 ans is 1, 2%2 ans is 0)
         */


    }
}
