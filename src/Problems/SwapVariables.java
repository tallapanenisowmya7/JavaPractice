package Problems;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
       String  firstvalue;
       String secondvalue;
       firstvalue = "";
        secondvalue = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstvalue :");
        firstvalue = sc.nextLine();
        System.out.println("Enter the secondvalue :");
        secondvalue = sc.nextLine();
        String temp;
        System.out.println("The String before swapping the firstvalue  is:"+firstvalue );
        System.out.println("The String before swapping the secondvalue  is:"+secondvalue );
//        firstvalue=firstvalue+secondvalue;
//        secondvalue=firstvalue-secondvalue;
//        firstvalue=firstvalue-secondvalue;
         temp=firstvalue;
         firstvalue=secondvalue;
         secondvalue=temp;


        System.out.println("The String after swapping the firstvalue  is:"+firstvalue );
        System.out.println("The String aftere swapping the secondvalue  is:"+secondvalue );

    }
}