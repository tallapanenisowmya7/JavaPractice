package Basics;

import java.util.Arrays;

public class SampleForloop1 {
    public static void main(String[] args){
       int[] num=new int[7];
       for(int i=0;i<num.length;i++){
           num[i]=i+1;
       }
       System.out.println("print the value of "+ Arrays.toString(num));
    }
}
