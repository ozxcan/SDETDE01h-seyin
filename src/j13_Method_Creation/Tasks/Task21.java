package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
            task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir tam sayı: ");
        int number = scan.nextInt();
        int basamak = basamakSayisi(number);
        System.out.println(number + " sayısı ==> " + basamak+" basamaklıdır.");




    }
    public static int basamakSayisi (int number) {
        int counter=0;
        String str = String.valueOf(number);
        for (int i =0; i < str.length(); i++) {
            counter++;
        }
        return counter;
    }
}
