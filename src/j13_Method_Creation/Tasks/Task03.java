package j13_Method_Creation.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.print("Dönüştüreceğiniz birimi giriniz (saat/mil/kg) : ");
        String birim = input.nextLine().toLowerCase();//saat mil kg cinsi

        System.out.print("Dönüştüreceginiz birimin miktarını giriniz : ");
        double miktar = input.nextDouble();//saat mil km miktarı
      //  donustur(birim, miktar);

        converter(birim,miktar);


    }//main sonu
    public static void converter (String birim, double miktar) {
        switch (birim) {
            case "saat":
                System.out.println(miktar * 3600+" saniye eder."); break;
            case "mil":
                System.out.println(miktar*(1.609344)+" km eder."); break;
            case "kg":
                System.out.println(miktar*1000+ " gram eder.");break;
        }
    }








}
