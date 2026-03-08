package Problems;

public class MissingNumber {
    public static void main(String[] args){
        int[] num={1,2,3,4,5,6,7,9};

        for (int i=0;i< num.length;i++)
        {
            int currentEle=num[i];
            int nextEle=num[i+1];
            if(currentEle+1!=nextEle)
            {
              // System.out.println("This is not a missing num");
                System.out.println("The  missing num is "+(currentEle+1));
                break;
            }



        }
















    }
}
