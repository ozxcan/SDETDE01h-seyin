package j11_Loops_Donguler.For_Loops.Tasks01;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        Scanner input = new Scanner(System.in);
        System.out.print("bizim gızzz birinç sayı gir bakennn : ");
        int sayi = input.nextInt();

        int fak = 1;

        for (int i =1; i <= sayi; i++) {
            fak = fak * i;

        }
        System.out.println("Sayının faktoriyel değeri : " + fak);












    }
}
