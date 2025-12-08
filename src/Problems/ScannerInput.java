package Problems;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //to get user input from console at runtime
        String s;
        System.out.println("Enter the value of string");
        s = sc.nextLine();//compiler waits for the user to give input
        System.out.println("The value of string is : " + s);
    }
}
