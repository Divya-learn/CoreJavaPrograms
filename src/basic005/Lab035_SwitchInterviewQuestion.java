package src.basic005;

public class Lab035_SwitchInterviewQuestion {

    public static void main(String[] args)
    {
        byte a=89;
        switch(a) //both of the statement are not executed because a=89 doesnot match with case10 and case 127
        {
            case 10:
                System.out.println("TEN");
            case 127:
                System.out.println("ONE TWENTY SEVEN");

                //op:- No output
        }


        String sen ="Hello";
        switch(sen)
        {
            case "Hello" :
                System.out.println("Print this");
            case "Hi" :
                System.out.println("Print-->");

               // o/p: Both statement will be printed beacuse break is not used Print this
                                                                    //          Print --->
        }


        String sen1 ="Hello";
        switch(sen1)
        {
            case "Hello" :
                System.out.println("Print this");
                break;
            case "Hi" :
                System.out.println("Print -->");

                // o/p: only one statement will be printed Print this
        }

        String sen2 ="Hello";
        switch(sen1)
        {
          //  case "Hello" :
          //      System.out.println("Print this");
            //     break;
          //  case "Hello" :
             //   System.out.println("Print -->");

                // o/p: Both statement should not same case nothing will be printed
        }



    }
}
