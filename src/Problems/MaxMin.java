package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] sowmya){
        int[] arr=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Elements");
        for (int i=0;i< arr.length;i++) {

            arr[i] = sc.nextInt();
        }
        int maxEle=Integer.MIN_VALUE;
        int minEle=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>maxEle)
            {
                maxEle=arr[i];
            }
            if (arr[i]<minEle) {
                minEle = arr[i];
            }
        }
        System.out.println("The maximum value in Array "+ Arrays.toString(arr)+ " is "+maxEle);
        //int minEle=Integer.MAX_VALUE;
        //for (int i=0;i< arr.length;i++) {
//            if (arr[i]<minEle) {
//                minEle = arr[i];
//            }
//        }
        System.out.println("The minimum value in Array "+ Arrays.toString(arr)+ " is "+minEle);



        }

    }
