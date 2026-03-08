package Problems;

import java.util.HashMap;
import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args){
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh string :");
        s1=sc.nextLine();
        int vowelsCount=0;
        int consonantsCount=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            char c1=s1.charAt(i);
            if(c1=='a'|| c1=='e'|| c1=='i'|| c1=='o'|| c1=='u')
            {

                if(map1.containsKey(c1))
                {
                    int freq=map1.get(c1);
                    freq=freq+1;
                    map1.put(c1,freq);
                }else

                    map1.put(c1,1);
                vowelsCount=vowelsCount+1;

            }else {
                if(map2.containsKey(c1))
                {
                    int freq=map2.get(c1);
                    freq=freq+1;
                    map1.put(c1,freq);
                }else
                    map2.put(c1,1);
                consonantsCount=consonantsCount+1;
            }
        }
        System.out.println("The number of vowels in the string are :"+vowelsCount+" "+ map1);
        System.out.println("The number of Consonants in the string are :"+consonantsCount+" "+map2);
    }
}
