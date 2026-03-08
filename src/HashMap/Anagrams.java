package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
/*9️⃣ Validate Anagrams (API Data Validation Context)

Given two strings, check if they are anagrams.

Input:
S1=“dog” S2=“god”
Output:
True, 2 strings are anagrams

Input 2:
S1=“cook” S2=“book”
Output2:
False, 2 strings are not anagrams*/
    public static void main(String args[]){
        String s1;
        String s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string :");
        s1=sc.nextLine();
        System.out.println("Enter the Second string :");
        s2=sc.nextLine();
        HashMap<Character,Integer> map1=new HashMap<>();
        for (int i=0;i<s1.length();i++)
        {
            char c1=s1.charAt(i);
            if(map1.containsKey(c1))
            {
                int freq=map1.get(c1);
                freq=freq+1;
                map1.put(c1,freq);
            }else
                map1.put(c1,1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for (int i=0;i<s2.length();i++)
        {
            char c2=s2.charAt(i);
            if(map2.containsKey(c2))
            {
                int freq=map2.get(c2);
                freq=freq+1;
                map1.put(c2,freq);
            }else
                map2.put(c2,1);
        }
        boolean  isAnagram=false;
        for(Map.Entry<Character,Integer> set: map1.entrySet())
        {
            char ch=set.getKey();
            int freq=set.getValue();
            if(map2.containsKey(ch)&&map2.get(ch)==freq)
            {
                isAnagram=true;
            }else{
                isAnagram=false;
                break;
            }
        }
        if ((isAnagram)) {
            System.out.println("Strings are anagram");
        }else
        {
            System.out.println("Strings are not anagram");

        }















    }
}
