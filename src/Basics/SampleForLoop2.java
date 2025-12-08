package Basics;

public class SampleForLoop2 {
    public static void main(String[] args){
        int[] nums =new int[10];
        for(int i = 0; i< nums.length; i++)
        {
            nums[i]=i+1;
        }
        //print only the even numbers of an array
        //[1,2,3,4,5,6,7,8,9,10] - input
        //[2,4,6,8,10] - output
        for (int i=0;i< nums.length;i++)
        {
            int digit=nums[i];

                if(digit%2==0){
                    System.out.print(digit+",");


                }

        }
        System.out.println();
    for(int i=0;i< nums.length;i++)
        {
            int digit=nums[i];
            if(digit%2==1){
                System.out.print(digit);
                if (i<nums.length-1){
                    System.out.print(",");
                }else{
                    System.out.print(".");
                }
            }
        }
    /*
    *
    */



    }
}
