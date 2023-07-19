package j13_Method_Creation.Sorular;

import java.util.Scanner;

public class S08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Write a Java method to compute the average of three numbers.
        Test Data:
            Input the first number: 25
            Input the second number: 45
             Input the third number: 65
             Expected Output:
         */

        int first = 25;
        int second = 45;
        int third = 65;

        ortalama (first, second, third);


    }
    public static void ortalama (int a, int b, int c) {
        double ortalama = (double) (a + b + c) /3;
        System.out.println(ortalama);

    }

}
