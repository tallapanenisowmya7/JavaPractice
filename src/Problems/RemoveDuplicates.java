package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        for (int i = 0; i < 5; i++) {
            int val = sc.nextInt();
            list.add(val);
        }
        list.sort(null);
        ArrayList<Integer> output = new ArrayList<>();
        for (int i=0;i<list.size()-1;i++)
        {
            int uniqueEle= list.get(i);
            if(list.get(i)!=list.get(i+1))
            {
                output.add(uniqueEle);
            }
        }
        if(output.get(output.size()-1)!=list.get(list.size()-1))
        {
            output.add(list.get(list.size()-1));
        }
        System.out.println("The values after removing duplicates are :"+output);

    }
}

