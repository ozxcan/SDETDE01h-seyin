package j05_Ilk_Dort_Konu_Tekrar;

public class H05_Math01 {
    public static void main(String[] args) {
        // Verilen bir int sayının küp kökünü ekrana yazdırınız

        int a = 8;

        System.out.println("Sayının küp kökü " + Math.pow(a, 1.0/3));
        /* 1.0/3 yazmamdaki sebep, sayıyı double yapmak içindi. 1/3 yaparsak, sayı integer olur
        ve 1/3 ü direk sıfır olarak alır.*/

        System.out.println("Sayının küp kökü " + Math.pow(a, (double)1/3));// Bu yanlış veriyor int olduğu için




    }
}
