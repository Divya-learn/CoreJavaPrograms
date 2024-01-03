package src.basic005;
import java.util.Scanner;

public class Lab032_Realtimeegswitchconditionforautomation {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter chrome,edge,firefox");
        String Browser = sc.nextLine();

        switch(Browser.toLowerCase())
        {
            case "chrome":
                System.out.println("using chrome");
                break;
            case "edge":
                System.out.println("using edge");
                break;
            case "firefox":
                System.out.println("using firefox");
                break;
            default:
                System.out.println("not using mentioned browser");
              //break is optional



        }
    }

}
