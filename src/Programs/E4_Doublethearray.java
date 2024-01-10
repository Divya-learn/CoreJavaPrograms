package src.Programs;

public class E4_Doublethearray {

    public static void main(String[] args)
    {
        //Double the array

        int[] arr = {45,67,89,45,67,89};
     //   int arr[] = {45,67,89,45,67,89};    // []--> we can put in datatype int[] or in variable name arr[]

        int arr1;

        for(int i=0;i<arr.length;i++)
        {
            arr1 = arr[i] *2;
            System.out.println(arr1);
        }
    }
}
