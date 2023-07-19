package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz

    */
        saniye();
        System.out.println("_-_-_-_-_-");
        System.out.println("Girilen saat ve dakika toplamda " + seconds()+ " saniyeye tekabül eder.");
        System.out.println("_-_-_-_-_-");



    }
    public static void saniye() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Saat gir: ");
        int saat = scan.nextInt();
        System.out.print("Dakika gir: ");
        int dakika = scan.nextInt();

        int convert = (saat * 60*60) + (dakika*60);
        System.out.println("Girilen " + saat + " saat "+ dakika + " dakika, " + convert + " saniyeye tekabül eder.");

    }
    public static int seconds () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Saat gir: ");
        int saat = scan.nextInt();
        System.out.print("Dakika gir: ");
        int dakika = scan.nextInt();
        return (saat * 60*60) + (dakika*60);
    }




}
