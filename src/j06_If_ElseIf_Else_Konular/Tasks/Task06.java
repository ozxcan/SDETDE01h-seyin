package j06_If_ElseIf_Else_Konular.Tasks;

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
		String cinsiyet = scan.nextLine();
		System.out.print("Yaşınızı giriniz: ");
		int yas = scan.nextInt();

		if (cinsiyet.equalsIgnoreCase("Erkek")) {
			if (yas >= 18) {
				System.out.println("Adam");
			}else {
				System.out.println("Erkek çocuk");

			}
		}else {
			if (cinsiyet.equalsIgnoreCase("Kadın")) {
				if (yas >= 18) {
					System.out.println("Kadın");

				}else {
					System.out.println("Kız çocuk");
				}
			}
		}
	}
}































