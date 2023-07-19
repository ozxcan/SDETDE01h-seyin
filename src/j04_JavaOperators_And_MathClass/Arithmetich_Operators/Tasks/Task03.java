package j04_JavaOperators_And_MathClass.Arithmetich_Operators.Tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Task->
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Üç basamaklı bir sayı giriniz: ");
		int a = scan.nextInt();

		int ilkRakam = a % 10; // Kalanı verir.
		int sonRakam = a / 100; // Bölümü yani sonucu verir.

		System.out.println("Toplam: " + Integer.sum(ilkRakam,sonRakam));






		
	}

}
