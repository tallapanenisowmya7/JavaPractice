package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CheckFrequency {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values :");
        for (int i=0;i<5;i++)
        {
            int val;
            val=sc.nextInt();
            list.add(val);
        }
        HashMap<Integer,Integer> elements=new HashMap<>();
        for (int i=0;i<list.size();i++)
        {
            int keyElement= list.get(i);
            if(elements.containsKey(keyElement))
            {
             int freq=elements.get(keyElement);
             freq=freq+1;
             elements.put(keyElement,freq);
            }
            else {
                elements.put(keyElement,1);
            }
        }
        System.out.println("The map is :" +elements);
    }
}
