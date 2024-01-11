package src.basic007;

import java.util.Arrays;

public class Lab060_Arrayinterviewques {

    public static void main(String[] args)
    {
        //In array memory allocation is different not same as string

       int[] arr1 = {3,4,5,6,7};  //different memory location
        int[] arr2 = {3,4,5,6,7}; //different memory location
        System.out.println(arr1 == arr2); //Both are different memory o/P:-false

        int[] arr3 = new int[] {1,2,3,4}; //different memory location
        int[] arr4 = new int[] {1,2,3,4}; //different memory location
        System.out.println(arr3 == arr4); //Both are different memory o/P:-false

        int[] arr5 = {77,88,99};  //different memory location
        int[] arr6 = {34,67}; //different memory location
        System.out.println(arr5 == arr6); //Both are different memory o/P:-false

        int[] arr7 = new int[] {45,78,90}; //different memory location
        int[] arr8 = new int[] {34,56}; //different memory location
        System.out.println(arr7 == arr8); //Both are different memory o/P:-false

        int[] arr9 = {3,4,5,6,7};  //different memory location
        int[] arr10 = {3,4,5,6,7}; //different memory location
        int[] arr11 = arr9; //arr9 is assigned to arr11 shares same memory location
        System.out.println(arr9 == arr11);  //o/p true

        int[] arr12 = new int[] {1,2,3,4}; //different memory location
        int[] arr13 = new int[] {1,2,3,4}; //different memory location
        int[] arr14 = arr13; // arr13 is assigned to arr14 shares memory location
        System.out.println(arr14 == arr13); // o/p true

        // .equals method   In case of string checks (content) but in array checks for (reference)


        int[] ar1 = {3,4,5,6,7};  //different memory location
        int[] ar2 = {3,4,5,6,7}; //different memory location
        System.out.println(ar1.equals(ar2)); //Both are different memory o/P:-false

        int[] ar3 = new int[] {1,2,3,4}; //different memory location
        int[] ar4 = new int[] {1,2,3,4}; //different memory location
        System.out.println(ar3.equals(ar4)); //Both are different memory o/P:-false

        int[] ar5 = {77,88,99};  //different memory location
        int[] ar6 = {34,67}; //different memory location
        System.out.println(ar5.equals(ar6)); //Both are different memory o/P:-false

        int[] ar7 = new int[] {45,78,90}; //different memory location
        int[] ar8 = new int[] {34,56}; //different memory location
        System.out.println(ar7.equals(ar8)); //Both are different memory o/P:-false

        int[] ar9 = {3,4,5,6,7};  //different memory location
        int[] ar10 = {3,4,5,6,7}; //different memory location
        int[] ar11 = ar9; //ar9 is assigned to ar11 shares same memory location
        System.out.println(ar9.equals(ar11));  //o/p true

        int[] ar12 = new int[] {1,2,3,4}; //different memory location
        int[] ar13 = new int[] {1,2,3,4}; //different memory location
        int[] ar14 = ar13; // ar13 is assigned to ar14 shares memory location
        System.out.println(ar14.equals(ar13)); // o/p true



        // Arrays.equals() method checks for content

        int[] a1 = {3,4,5,6,7};  // same content
        int[] a2 = {3,4,5,6,7}; // same content
        System.out.println(Arrays.equals(a1,a2)); //Both are same content o/P:-true

        int[] a3 = new int[] {1,2,3,4}; // same content
        int[] a4 = new int[] {1,2,3,4}; // same content
        System.out.println(Arrays.equals(a3,a4)); // Both are same content o/P:-true

        int[] a5 = {77,88,99};  //different content
        int[] a6 = {34,67}; //different content
        System.out.println(Arrays.equals(a5,a6)); //Both are different content o/P:-false

        int[] a7 = new int[] {45,78,90}; //different content
        int[] a8 = new int[] {34,56}; //different content
        System.out.println(Arrays.equals(a7,a8)); //Both are different content o/P:-false

        int[] a9 = {3,4,5,6,7};  // same content
        int[] a10 = {3,4,5,6,7}; // same content
        int[] a11 = a9; //a9 is assigned to a11 same content
        System.out.println(Arrays.equals(a9,a11));  //o/p true

        int[] a12 = new int[] {1,2,3,4}; // same content
        int[] a13 = new int[] {1,2,3,4}; // same content
        int[] a14 = a13; // a13 is assigned to a14 same contengt
        System.out.println(Arrays.equals(a14,a13)); // o/p true

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1==s2); //true

        String s3 = new String("HI");
        String s4 = new String("Hi");

        System.out.println(s3==s4); //false

    }
}
