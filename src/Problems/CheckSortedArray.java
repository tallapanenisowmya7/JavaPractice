package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println(num[num.length - 1]);
        for (int i = 0; i < num.length; i++) {
            //****
            // [1,2,3,4]
            // /
            if ((i + 1) < num.length) {
                int currentValue = num[i];
                int nextValue = num[i + 1];
                if (currentValue > nextValue) {
                    System.out.println("The array is not sorted " + Arrays.toString(num));
                    break;
                }

            }


        }

    }
}
