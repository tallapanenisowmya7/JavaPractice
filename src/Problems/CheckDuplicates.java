package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class CheckDuplicates {
    public static void main(String[] args){
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        boolean isDuplicate=false;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[i+1])
            {
                isDuplicate = true;
                break;
            }
        }
        if(isDuplicate)
        {
            System.out.println("The Array has Duplicate values "+Arrays.toString(arr) );
        }else{
            System.out.println("The Array has no Duplicate values "+Arrays.toString(arr) );
        }
    }
}
