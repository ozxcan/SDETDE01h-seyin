package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Cinsiyetinizi giriniz: ");
		String c = scan.nextLine();
		System.out.print("Yaşınızı giriniz: ");
		int yas = scan.nextInt();

		// Ilk yöntem

		String sonuc = (c.equalsIgnoreCase("Erkek")) ? ((yas < 18) ? "Erkek çocuk" : "Adam") :
				((c.equalsIgnoreCase("Kadın")) ? ((yas < 18) ? "Kız çocuk" : "Kadın"): "Geçersiz cinsiyet");
		System.out.println(sonuc);

		// Ikinci Yöntem
		String sonuc2 = (c.equalsIgnoreCase("Erkek")) ? ((yas < 18) ? "Erkek çocuk" : "Adam") : ((yas < 18) ? "Kız çocuk" : "Kadın");
		System.out.println(sonuc2);











	}
}































