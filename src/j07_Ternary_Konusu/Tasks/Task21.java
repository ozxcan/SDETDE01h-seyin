package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /* 5 sayıdan en küçüğünü (if kullanarak bulunuz)
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci Sayı: ");
        int s1 = scan.nextInt();
        System.out.print("İkinci Sayı: ");
        int s2 = scan.nextInt();
        System.out.print("Ücüncü Sayı: ");
        int s3 = scan.nextInt();
        System.out.print("Dördüncü Sayı: ");
        int s4 = scan.nextInt();
        System.out.print("Beşinci Sayı: ");
        int s5 = scan.nextInt();

        int eK= s1;


        if(s2 < eK) {
            eK = s2;
        }
        if(s3 < eK) {
            eK = s3;
        }
        if (s4 < eK) {
            eK = s4;
        }
        if (s5 < eK){
            eK = s5;
        }
        System.out.println("En küçük sayı " + eK);









    }
}
