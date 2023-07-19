package j11_Loops_Donguler.While_Loops.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin
		son harfine kadar olan butun harfleri ayni satirda aralarina bosluk birakarak
		print rden code create ediniz
		Örnek : input : ali kale
		output : A B C D E
		input Hasan Can
		output H I J K L M N
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Isim ve Soyisim giriniz: ");
		String str = scan.nextLine();


		char firstLetter = str.toUpperCase().charAt(0);
		char lastLetter = str.toUpperCase().charAt(str.length() - 1);
		int a = firstLetter;
		int b = lastLetter;



		while (a <= b) {

			System.out.print((char)a+ " ");
			a++;


		}
		System.out.println();
		System.out.println("================");

		// do while ile yapalım

		a = firstLetter;
		do {

			System.out.print((char)a+ " ");
			a++;
		}while (a <= b);

		System.out.println();
		System.out.println("================");

//		//for ile yapalım
//		for (int i = a; i <b+1; i++) {
//			System.out.print((char)i + " ");
//
//		}













	}

}
