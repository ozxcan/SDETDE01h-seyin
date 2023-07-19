package j12_Break_Continue;

import java.util.Scanner;

public class C04_Exp_ASALKontrol {
    public static void main(String[] args) {

        /*
        Task ------->
        Girilen tam sayının asal olmasını kontrol eden code creat ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Asal kontrolü yapılacak sayı: ");
        int num = scan.nextInt();
        boolean asalMi= true;

        for (int i= 2; i < num; i++) {
            System.out.print(i+ " ");

            if (num % i == 0){
                asalMi = false;
                break;
            }

        }
        System.out.println();
        if (asalMi) System.out.println(num + " asaldır.");
        else System.out.println(num + " asal değildir.");




    }
}
