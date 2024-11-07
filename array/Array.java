
import java.util.Arrays;
import java.util.Scanner;



public class Array {
    public static void main(String[] args) {
        // array are store in heap memory in java and might not be in continious behaviour depends on jvm .
Scanner in = new Scanner(System.in);

        // int arr[]=new int [5];
        // arr[0]=56;
        // System.out.println(arr[0]);

        // or we can use directly 

        // int[] arr={56,59,53};
        // System.out.println(arr[0]);

        // for (int i =0;i<arr.length;i++){
        //     arr[i]=i;
        // }
         
        // System.out.println(Arrays.toString(arr));

        // multidimensional array
        // int[][] arr= new arr[3][] // row is mandatory but column is not


        // int[][] arr2d={
        //     {1,2,3},//1st index 
        //     {4,5}//2nd index
        // };

        // taking input

        int [][]inputarr=new int[3][2];
            System.out.println(inputarr.length);
        // int i=in.nextInt();
        // input
        for (int i = 0; i < inputarr.length; i++) {//row
            for (int j = 0; j < inputarr[i].length ; j++) {//col
                inputarr[i][j]=in.nextInt();
            }
        }
        // output
        // for ( int i = 0; i < inputarr.length; i++) {//row
        //     for (int j = 0; j < inputarr[i].length ; j++) {//col
        //         System.out.print(inputarr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // another

        for (int i = 0; i < inputarr.length; i++) {
            System.out.println(Arrays.toString(inputarr[i]));
        }

        int [][] arr1= {
            {1,2,3},
            {12},
            {1,2}
        };
        
        //foreach loop
        for(int[] a :arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
