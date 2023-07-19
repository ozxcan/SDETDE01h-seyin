package j13_Method_Creation.Sorular;

import java.util.Scanner;


public class S04 {
    public static void main(String[] args) {
        /*
       Soru 2)
       Write a method named isEven that accepts an integer argument.
        The method should return true if the argument is even, or false otherwise.

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı: ");
        int num = scan.nextInt();
        System.out.println(isEven(num));




    }
    public static boolean isEven(int a) {
        boolean isEven = true;
        if (a % 2 == 0){
            isEven = true;
        }else {
            isEven = false;
        }
     return isEven;
    }



}
