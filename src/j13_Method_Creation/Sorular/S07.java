package j13_Method_Creation.Sorular;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Write a Java method to find the smallest number among three numbers.
            Test Data:
            Input the first number: 25
            Input the Second number: 37
            Input the third number: 29
         */

        int first = 25;
        int second = 32;
        int third = 29;

        int eK = eK (first, second, third);
        System.out.println(eK);


    }
    public static int eK (int a, int b, int c) {
        int eK = Math.min(a, Math.min(b, c));

        return eK;
    }


}
