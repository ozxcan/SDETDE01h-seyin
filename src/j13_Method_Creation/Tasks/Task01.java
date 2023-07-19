package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();
        esit(num1, num2);
        System.out.println("======");
        System.out.println("sayılar eşit mi ? "+sayilarEsitMi(num1, num2));


    }//main sonu
    public static void esit(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Sayılar eşittir.");
        }else System.out.println("Sayılar eşit değildir.");

    }
    public static boolean sayilarEsitMi (int num1, int num2) {
        boolean sonuc = true;
        if (num1 == num2) sonuc = true;
        else sonuc=false;
        return sonuc;
    }





}//class sonu
