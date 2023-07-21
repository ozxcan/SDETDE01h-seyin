package j13_Method_Creation.Hesap_Makinesi_Project;

import java.util.Scanner;

public class With_Static_Metotlar {
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hesap makinesine hoşgeldiniz ");
        System.out.print("Toplama -1\nÇıkarma-2\nÇarpma-3\nBölme-4\nHangi işlemi yapmak istersiniz: ");
        int secim = scan.nextInt();
        System.out.print("Birinci sayıyı giriniz: ");
        int s1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int s2 = scan.nextInt();

        switch (secim) {
            case 1 : toplama(s1,s2); break;
            case 2 : cikarma(s1,s2); break;
            case 3 : carpma(s1,s2); break;
            case 4 : bolme(s1,s2); break;
            default:
                System.out.println("Hatalı seçim yaptınız!");
        }
    }

    private static void bolme(int a,int b) {
        int bolme = Math.max(a,b)/Math.min(a,b);
        System.out.println("Bölme işlemi sonucu => " +bolme);
    }

    private static void carpma(int a,int b) {
        int carpma = a*b;
        System.out.println("Çarpma işlemi sonucu => " +carpma);
    }

    private static void cikarma(int a, int b) {
        int cikarma = Math.max(a,b)-Math.min(a,b);
        System.out.println("Çıkarma işlemi sonucu => "+cikarma);
    }

    private static void toplama(int a, int b) {
        int toplama = a+b;
        System.out.println("Toplama işlemi sonucu => "+toplama);
    }

}
