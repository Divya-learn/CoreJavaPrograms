package src.PavanPrograms;

import java.util.Scanner;

public class L4_switch {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int  num = sc.nextInt();

        switch(num)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thrus");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Sun");

        }

    }
}
