package HashMap;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String args[]){
/*First Non-Repeating Word in Log
Input:
"error timeout error db timeout network"

Output:
"db"

*/
        String sentence;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence :");
        sentence=sc.nextLine();
        String[] arr=sentence.split(" ");
        System.out.println("The array of strings is "+ Arrays.toString(arr));
        HashMap<String,Integer> map=new HashMap<>();
        for (int i=0;i< arr.length;i++)
        {
            String ele=arr[i];
            if(map.containsKey(ele))
            {
                int freq=map.get(ele);
                freq=freq+1;
                map.put(ele,freq);

            }
            else{
                map.put(ele,1);
            }
        }
        /*Key,Value
        *error,2
        * timeout,2
        * db,1
        * network,1
        */
//        ArrayList<String> nonRepeating=new ArrayList<>();
//        for(Map.Entry<String,Integer> set:map.entrySet())
//
//                {
//                    if(set.getValue()==1)
//                    {
//                        nonRepeating.add(set.getKey());
//                        break;
//
//                    }
//
//                }
//        System.out.println("The first Non repeating string is :"+nonRepeating);
        for (int i=0;i< arr.length;i++)
        {
            String key=arr[i];
            if(map.get(key)==1)
            {
                System.out.println("The first Non repeating string is:"+key);
                break;
            }
        }









    }
}
