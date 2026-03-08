package Problems;

import java.util.ArrayList;

public class FibonacciSeries {
    public static void main(String[] args){
    ArrayList<Integer> list=new ArrayList<>();
    int a=0;
    int b=1;
    list.add(a);
    list.add(b);
    int c=0;
    System.out.println("The Fibonocci series is :");
    for(int i=0;i<10;i++)
    {
        c=a+b;
        a=b;
        b=c;
        list.add(c);

    }
  System.out.println(list);

}
}


