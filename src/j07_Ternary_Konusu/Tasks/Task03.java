package j07_Ternary_Konusu.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */

        Scanner input = new Scanner(System.in);
        System.out.print("agam yıl giresen : ");
        int yil = input.nextInt();

        String yilString = (yil >= 1000) ? "Milenyum" : ((yil >= 100) ? "Yüzyıl" : ((yil >= 10) ? "Onyıl" : "Tekrar deneyiniz."));
        System.out.println(yilString);





    }
}

	

