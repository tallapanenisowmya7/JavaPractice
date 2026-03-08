package Problems;

public class FizzBuzz {
     public static void main(String[] args){
         for (int i=1;i<=100;i++)
         {
             if((i%3==0) && (i%5==0))
             {
                 System.out.print("FIZZBUZZ :"+i+" ,");
             } else if (i%3==0) {
                 System.out.print("FIZZ :"+i+" ,");
             } else if (i%5==0) {
                 System.out.print("BUZZ :"+i+" ,");

             }


         }
    }
}
