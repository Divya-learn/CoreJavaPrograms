package src.basic005;
import java.util.Scanner;

public class Lab031_Switchcondition {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from 1-7 I will tell the day");
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("Monday");
             break;  //In if else break can't be used
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter number from 1 to 7");
                break;  //break is optional at last for default
            //if we write default at first break is complusory


        }

        System.out.println("-----End------");






    }

}
