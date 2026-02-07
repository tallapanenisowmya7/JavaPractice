package Problems;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();

        //step 1:Convert given int to string
        String str;
        str = Integer.toString(num);

        //step 2:Reverse the string
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            str2 = str2 + ch;
        }

        //step 3:convert the string to integer
        int output;
        output = Integer.parseInt(str2);
        System.out.println("The Reversed num is :" + output);
    }
}
