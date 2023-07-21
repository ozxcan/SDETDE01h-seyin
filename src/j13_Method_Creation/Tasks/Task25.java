package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num3=input.nextInt();

        int faktoriyel = fakt(num3);
        System.out.println(num3+ " sayısının faktoriyeli "+ faktoriyel);




    }
    public static int fakt (int num3) {
        int factorial=1;
        for (int i=1; i<=num3; i++) {
            System.out.print(i+ " ");
            factorial *= i;

        }
        System.out.println();
        return factorial;

    }
}
