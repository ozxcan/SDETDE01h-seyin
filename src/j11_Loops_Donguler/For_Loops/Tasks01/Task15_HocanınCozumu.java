package j11_Loops_Donguler.For_Loops.Tasks01;

public class Task15_HocanınCozumu {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		String str = "aaa1234567890";
		// rakam olmayanları kaldır , geriye rakamlar kalsın onun sayısı
		int rakamSayisi = str.replaceAll("\\D","").length();
		System.out.println(rakamSayisi);

	}
}
