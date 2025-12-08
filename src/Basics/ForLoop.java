package Basics;

public class ForLoop {
    public static void main(String[] args){
        String[] items = {"pista","apple","egg","pear"};
        String[] names=new String[2];
        names[0]="phani";
        names[1]="sowmya";
        int i =0;
        for(i=0; i<names.length;i++)
        {
            System.out.println("Item is " + names[i]);
        }
    }
}
