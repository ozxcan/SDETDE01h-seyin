package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan rakamsal password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir password giriniz: ");
		int pass = scan.nextInt();

		String sonRakam = (pass % 5 == 0) ? ((pass % 10 == 0) ? "5'e bölünen çift sayı" : "5'e bölünen tek sayı") : "Tekrar deneyin";

//		//int sonRakam = pass % 10;
//
//		if ( pass % 5 == 0 ) {
//			if ( pass % 10 == 0) {  // son rakamın ancak 10 mod işleminde sıfır olur.
//				System.out.println("5'e bölünen çift sayı");
//
//			}else {   			// Sayı 5'e tam bölüyorsa, son rakamı ya 0 ya da 5'tir.
//				System.out.println("5'e bölünen tek sayı");
//			}
//
//		}else {
//			System.out.println("Tekrar deneyin");
//		}


	}

}
