package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		String str = "jadsjl5216kjşl5496k524524j5j24";

		int rakam = 0;

		for (int i = 0; i < str.length(); ++i) {
			if (Character.isDigit(str.charAt(i))) {
				++rakam;
			}
		}
		System.out.println("Toplam rakam sayısı ==> " + rakam);
		System.out.println("****************");

		// Çözüm 2

		int rakamSayisi = str.replaceAll( "\\D", "").length(); // " \\D " ile rakam olmayanları kaldırdık, kalanın sayısını verdik.
		System.out.println("Toplam rakam sayısı ==> " + rakamSayisi);



	}


}
