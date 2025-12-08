package Problems;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num=sc.nextInt();
        isEvenOrOdd(num);
    }
    public static void isEvenOrOdd(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }
        else {
            System.out.println(num+" is odd");
        }

    }
}
