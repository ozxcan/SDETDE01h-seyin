package j13_Method_Creation.Sorular;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        /*
        Write a Java method to compute the sum of digits in an integer.
                Test Data:
                Input an integer: 25
                Expected Output:

                The sum is 7
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir integer değeri gir: ");
        int num = scan.nextInt();

        int sum = sum(num);
        System.out.println("The sum is " +sum);



    }
    public static  int sum (int num) {
        int sum = 0;
        String sayi = String.valueOf(num);
        for (int i = 0; i < sayi.length(); i++) {
            sum = sum + Integer.parseInt(sayi.substring(i,i+1));

        }
        return sum;

    }
}
