package src.basic006;

public class Lab056_dowhileloop {

    public static void main(String[] args)
    {
        int i=5;
        do{
            System.out.println(i); //condition will be executed atleast one time
            i++;
        }while(i<5); //condition is fail  //op: 5


        int j=5;
        while(j<5)
        {
            System.out.println(j);
            j++;                      //o/p: No output
        }
    }
}
