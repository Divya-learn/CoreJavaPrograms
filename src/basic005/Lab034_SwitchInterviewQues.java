package src.basic005;

public class Lab034_SwitchInterviewQues {

    public static void main(String[] args)
    {
        //In switch float,double,boolean cannot be used

        float num =67.89f;
      //  switch(num)  float is not used in switch
        {

        }

        float num2=98.78f;
        switch((int)num2)  //after type casting float into int we can use in switch
        {

        }

        double num3= 89.55;
       // switch(num3) double not used in switch after type casting can be used
        {

        }

        boolean b = true;
      //  switch(b) boolean is not used
        {

        }

        long num4 = 788888l;
      //  switch(num4) long is not used
        {

        }
    }
}
