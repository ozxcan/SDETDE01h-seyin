package j03_ScannerClass_And_TypeCasting.Tasks_ScannerClass_TypeCasting;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int tam1 = scan.nextInt();

        System.out.print("İkinci tam sayıyı giriniz: ");
        int tam2 = scan.nextInt();
        System.out.println("Toplama işlemi: " +(tam1+tam2)+","+ " çıkarma işlemi: "+(tam1-tam2)+","+" çarpma işlemi: "+ (tam1*tam2)+","+" bölme işlemi: " + (tam1/tam2));

        int eB = Integer.max(tam1,tam2);
        int eK = Integer.min(tam1,tam2);
        System.out.println("Toplama işlemi: " +(eB+eK)+","+ " çıkarma işlemi: "+(eB-eK)+","+" çarpma işlemi: "+ (eB*eK)+","+" bölme işlemi: " + (eB/eK));




    }

}
