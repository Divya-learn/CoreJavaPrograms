package src.basic007;

public class Lab070_Array2D {

    public static void main(String[] args)
    {
        int[] arr = new int[] {1,2,3}; //one dimensional array

        //Two dimensional array

   /*     int[][] arr1 =new int[3][2];

        arr1[0][0] = 48;
        arr1[0][1] = 34;
       // arr1[0][2] = 67;

        arr1[1][0] = 56;
        arr1[1][1] = 89;
       // arr1[1][2] = 67;

        arr1[2][0] = 89;
        arr1[2][1] = 34;
        //arr1[2][2] = 23;
      */

      int[][] arr1 = new int[][]{{ 48,34,67},{56,89,67}, {89,34,23}};


        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0; j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }


    }
}
