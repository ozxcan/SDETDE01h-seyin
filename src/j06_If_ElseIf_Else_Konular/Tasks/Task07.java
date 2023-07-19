package j06_If_ElseIf_Else_Konular.Tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */

        // 'A' = 65,    'Z'=90
        // 'a' = 97     'z'=122


        Scanner scan = new Scanner(System.in);
        System.out.print("Harf girin: ");
        char harf = scan.next().charAt(0);

        if (!Character.isAlphabetic(harf)) {     // Burda harf girilmez ise işlem yapılsın istedim
            System.out.println("Yanlış bir işlem yaptınız.");

        }else {
            if (Character.isLowerCase(harf)) {   // Karakterin küçük mü değil mi sorguluyorum.
                if (harf == 'a') {
                    System.out.println("Ilk küçük harf");

                }else {
                    System.out.println("Ilk küçük harf değil");
                }

            }else {                         // Burda Character.isUpperCase(harf), büyük harf kısmını sorguladı
                if (harf == 'Z') {
                    System.out.println("Son büyük harf");

                }else {                     // harf != 'Z' değil kismini burda sorguladı
                    System.out.println("Son büyük harf değil");
                }


            }
        }






    }


}
