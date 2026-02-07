package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class FindEle {
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements :");
        for (int i=0;i<5;i++)
        {
            String val;
            val = sc.nextLine();
            list.add(val);
        }
        System.out.println("Enter the Search Element : ");
        String searchEle="";
        searchEle=sc.nextLine();
        boolean isSearchEle=false;
        for (int i=0;i< list.size();i++)
        {
            if (list.get(i).equals(searchEle)) //if(list.get(i)==searchEle)-->if it's an integer
            {
                isSearchEle=true;
                break;
            }
        }
        if(isSearchEle)
        {
            System.out.println("The searchElement exists in the ArrayList :"+searchEle);
        }else{
            System.out.println("The searchElement doesn't exists in the ArrayList :"+searchEle);
        }

    }
}
