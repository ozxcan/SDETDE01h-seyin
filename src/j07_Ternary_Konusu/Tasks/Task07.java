package j07_Ternary_Konusu.Tasks;

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

        String result = (Character.isAlphabetic(harf))? ((Character.isLowerCase(harf)) ? ((harf == 'a') ? "Ilk küçük harf" : "Ilk küçük harf değil") : (harf == 'Z') ? "Son büyük harf" : "Son büyük harf değil"): "Yanlış bir işlem yaptınız.";
        System.out.println(result);






    }


}
