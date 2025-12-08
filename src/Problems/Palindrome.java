package Problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = "";
        System.out.println("Enter the value : ");
        name=sc.nextLine();
        //*
        // 0 1 2 3 4
        // G A D A G
        // *//
        String reversed="";
        reversed=reversedString(name);
        if (name.equals(reversed))
        {
            System.out.println(name+" is a palindrome");
        }
        else
        {
            System.out.println(name+" is not a palindrome");
        }

    }
    public static String reversedString(String name){
        String reversed="";
        for(int i=name.length()-1;i>=0;i--)
        {
            char ch=name.charAt(i);
            reversed=reversed+ch;
        }
        return reversed;
    }
}