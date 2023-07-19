package j07_Ternary_Konusu;

import java.util.Scanner;

public class C09_Example {

    public static void main(String[] args) {
        /*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.

		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci kenar uzunlugunu girin: ");
        double a = scan.nextDouble();
        System.out.print("ikinci kenar uzunlugu: ");
        double b = scan.nextDouble();
        System.out.print("ucuncu kenar uzunlugunu girin: ");
        double c = scan.nextDouble();

        String sonuc = (a == b && b == c) ? "Eşkenar Üçgen" : ((a == b || b == c || a == c) ? "İkizkenar üçgen" : "Çeşitkenar üçgen");
        System.out.println(sonuc);






    }

}
