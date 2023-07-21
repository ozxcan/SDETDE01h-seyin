package j13_Method_Creation;

import java.util.Scanner;

public class C05_Method_Overloading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         /*
                            >>> METHOD OVERLOADING >>>
         -Metodun adı
         -Parametrelerin sayısı
         -Parametrelerin data type 'i
         -Parametreler aynı kalmak zorunda ise bunların  sırası değiştirilerek
         metod overloading i çözmek için değerlendirilir.
          */
        String str = "Selamlar";
        int s1 = 10;
        int s2 = 20;
        double s3 = 30;
        yaz(str);
        yaz(s1);
        yaz(s1,s2);
        yaz(s1,s3);
        yaz(s3,s1);


    }

    private static void yaz(String str) {
        System.out.println(str);
    }
    private static void yaz(int s1) {
        System.out.println("Sayı = "+s1);
    }
    private static void yaz(int s1,int s2) {
        System.out.println("Toplam = "+(s1+s2));
    }private static void yaz(int s1,double s3) {
        System.out.println("Toplam = "+(s1+s3));
    }
    private static void yaz(double s1,int s3) {
        System.out.println("Toplam = " + (s1 + s3));
    }


}
