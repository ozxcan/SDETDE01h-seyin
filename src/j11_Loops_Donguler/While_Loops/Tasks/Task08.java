package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.print("Şirferiniz giriniz: ");
        String str = scan.nextLine();

        if (str.length() >=10) {
            if (str.charAt(0) >='a' && str.charAt(0) <='z') {
                if (Character.isDigit(str.charAt(str.length()-1))) {
                    if (!str.contains(" ")) {
                        System.out.println("Şifre başarıyla kaydedildi.");
                    }else System.out.println("Şifrede boşluk olmamalıdır.");

                }else System.out.println("Son karakter digit olmalı.");
            }else System.out.println("Ilk karakter küçük harf olmalı.");

        }else System.out.println("En az 10 karakter olmalıdır.");






    }



}
