package Problems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //to get user input from console at runtime
        String s;
        System.out.println("Enter the value of string");
        s=sc.nextLine();//compiler waits for the user to give input
        System.out.println("The value of string is : "+s);
        reverseString(s);

    }
    public static void reverseString(String s){
        String s1="";
        //char[] ch=new char[s.length()];
        for (int i=s.length()-1;i>=0;i--)
        {
            //sowmya
            //aymwos
            char ch = s.charAt(i);
            s1=s1+ch;
        }
        System.out.println("The Reveresed String is :"+s1);


    }

}
