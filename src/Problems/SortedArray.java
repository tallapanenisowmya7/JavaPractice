package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args){
        int[] arr=new int [7];
        Scanner sc=new Scanner(System.in);
       // int a=sc.nextInt();
        System.out.println("Enter the values of the array");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //easy way
       // Arrays.sort(arr); time complexity is big 0(n log n )
        //[1,2,3,4]
        boolean isSorted = true;
        for (int i=0;i<arr.length-1;i++)
        {
          // if (i+1<arr.length)
           //{
               if (arr[i]>arr[i+1])
               {
                   isSorted=false;
                   break;
               }
           //}
        }
        if (isSorted) {
            System.out.println("Array is sorted "+Arrays.toString(arr));
        }
        else{
            System.out.println("Array is not sorted "+Arrays.toString(arr));
        }
    }
}
