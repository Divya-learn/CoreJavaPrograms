package src.basic003;

public class Lab021_Maximumofthreenumbers {

    public static void main(String[] args){

        int a =10, b= 90, c= 145;

        /* a>b a>c b>c b>a c>b c>a

              a>b ? ((a > c) ? a : c) : ((b > c) ? b :c)
                      10>45        45
                                          90>45    90
         */

        //                   a is greater      b is greater
        int result = a>b ? ((a>c) ? a : c) : ((b>c) ? b:c);
        System.out.println(result);
    }
}
