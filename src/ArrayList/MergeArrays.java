package ArrayList;

import java.util.*;

public class MergeArrays {
    public static void main(String[] args)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements of first Array :");
        for (int i=0;i<5;i++)
        {
            int num=sc.nextInt();
            list1.add(num);
        }
        System.out.println("Enter the Elements of second Array");
        for (int i=0;i<5;i++)
        {
            int num=sc.nextInt();
            list2.add(num);
        }
        ArrayList<Integer> output=new ArrayList<>();
        for (int i=0;i<list1.size();i++)
        {
            int num=list1.get(i);
            output.add(num);
        }
        for (int i=0;i<list2.size();i++)
        {
            int num=list2.get(i);
            output.add(num);
        }
        Collections.sort(output);
        System.out.println("The Merged Arrays are :"+output);

























        //remove duplicates from merged arraylist
       // ArrayList<Integer> nonDuplicates = new ArrayList<>();
        //The merged arrays are :[2, 3, 3, 4, 4, 5, 5, 7, 10, 12]
        //i=0, uniqueEle=list.get(i)=2 , nonDuplicates=[2] , if list.get(i)!=list.get(i+1)
        //i=1, uniqueEle=list.get(i)=3 , nonDuplicates=[2,3]

    }
}
