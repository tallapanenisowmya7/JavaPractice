package Problems;

import java.util.Scanner;

public class PalindromeNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        System.out.println("Enter the name:");
        sc.nextLine();
        String reversed = "";
        reversed = reversedString(name);
        if (reversed.equals(name)) {
            System.out.println("The given string is palindrome :" + name);
        } else {
            System.out.println("The given string is not palindrome :" + name);
        }


    }

    public static String reversedString(String name) {
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            char ch = name.charAt(i);
            reversed = reversed + ch;
        }
        return reversed;
    }
}