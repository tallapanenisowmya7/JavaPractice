package Problems;

import java.util.Scanner;

public class FilterCharacters {
   public static void main(String[] args){

       String s;
       s="";
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String:");
       s= sc.nextLine();
       String output="";
       for (int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if((c>='a'&& c <='z') || (c >='A'&& c <='Z'))

           {
               output=output+c;
           }
       }
       System.out.println("The String is :"+output);




   }
}