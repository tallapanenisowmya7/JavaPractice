package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingAndNonRepeating {
    public static void main(String[] args) {
        String s1;
        s1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        s1 = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(map.containsKey(c))
            {
                int freq=map.get(c);
                freq=freq+1;
                map.put(c,freq);
            }else {
                map.put(c,1);
            }
        }
        ArrayList<Character> repeating = new ArrayList<>();
        ArrayList<Character> nonrepeating =new ArrayList<>();
        for(Map.Entry<Character,Integer> set : map.entrySet())
        {
            if(set.getValue()>1)
            {
                repeating.add(set.getKey());
            }else{
                nonrepeating.add(set.getKey());
            }
        }
        System.out.println("The Repeating Elements in the string are :"+repeating);
        System.out.println("The Non-Repeating Elements in the string are :"+nonrepeating);

    }
}
