package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz


        dortIslem();
        System.out.println();
        System.out.println("İşlem sonucu: "+islem());
        System.out.println();

        System.out.println("AGAM code cincix DEWAMKEEE :) ");

    }//main sonu

    public static void dortIslem() {

        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.print("islem seçiminizi giriniz (+,*,-,/) : ");

        double sonuc=0;

        char islem = input.next().charAt(0);
        switch (islem) {
            case '+':sonuc =sayi1+sayi2;break;
            case '-':sonuc =sayi1-sayi2;break;
            case '*':sonuc =sayi1*sayi2;break;
            case '/':sonuc =sayi1/sayi2;break;
            default:
                System.out.println("İşlemi hatalı seçtiniz.");
        }
        System.out.println("İşlem sonucu: "+sonuc);



    }
    public static double islem () {

        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = input.nextDouble();

        System.out.print("islem seçiminizi giriniz (+,*,-,/) : ");

        double sonuc=0;

        char islem = input.next().charAt(0);
        switch (islem) {
            case '+':sonuc =sayi1+sayi2;break;
            case '-':sonuc =sayi1-sayi2;break;
            case '*':sonuc =sayi1*sayi2;break;
            case '/':sonuc =sayi1/sayi2;break;
            default:
                System.out.println("İşlemi hatalı seçtiniz.");
        }
        return sonuc;

    }




}
